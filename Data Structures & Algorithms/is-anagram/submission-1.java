class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer>map = new HashMap<>();
        if(s.length()!=t.length())
        return false;
        char[] string1 = s.toCharArray();
        char[] string2 = t.toCharArray();
        for(int i = 0;i<string1.length;i++){
            map.put(string1[i], map.getOrDefault(string1[i],0)+1);
        }

        for(int i = 0;i<string2.length;i++){
            if(!map.containsKey(string2[i]))
            return false;
            else if(map.get(string2[i])<=0)
            return false;
            else
            map.put(string2[i], map.get(string2[i])-1);
        }

        return true;
    }
}
