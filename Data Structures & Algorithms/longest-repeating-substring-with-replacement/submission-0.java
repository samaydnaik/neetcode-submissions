class Solution {
    public int characterReplacement(String s, int k) {
        HashSet<Character>set = new HashSet<>();
        int maxLength = 0;
        for(int i = 0;i<s.length();i++){
            set.add(s.charAt(i));
        }

        for(char c: set){
            int count = 0, l = 0;
            for(int r = 0;r<s.length();r++){
                if(c == s.charAt(r)) count++;

                while(r - l + 1 - count > k ){
                    if(s.charAt(l) == c) count --;
                    l++;
                }

                maxLength = Math.max(maxLength, r-l+1);
            }
        }

        return maxLength;

    }
}
