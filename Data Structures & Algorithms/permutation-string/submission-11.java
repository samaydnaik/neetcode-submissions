class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s2.length()<s1.length()) return false;
        int[] s1Count = new int[26];
        int[] s2Count = new int[26];
        for(int i = 0;i<s1.length();i++){
            s1Count[s1.charAt(i)-'a']++;
            s2Count[s2.charAt(i)-'a']++;
        }

        int match = 0;
        for(int i = 0;i<26;i++){
            if(s1Count[i] == s2Count[i]){
                match++;
            }
        }

        int l = 0;
        for(int r = s1.length();r<s2.length();r++){
            if(match == 26) return true;
            s2Count[s2.charAt(r)-'a']++;
            if(s2Count[s2.charAt(r)-'a'] == s1Count[s2.charAt(r)-'a'])
            match++;
            else if(s2Count[s2.charAt(r)-'a'] == s1Count[s2.charAt(r)-'a']+1){
            match--;
            }

            s2Count[s2.charAt(l)-'a']--;
            if(s2Count[s2.charAt(l)-'a'] == s1Count[s2.charAt(l)-'a'])
            match++;
            else if(s2Count[s2.charAt(l)-'a'] == s1Count[s2.charAt(l)-'a']-1){
            match--;
            }
            l++;
        }

        return  match == 26;
    }
}
