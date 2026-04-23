class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> hashMap = new HashMap<>();
        if(s.length()!= t.length())
        return false;
        for(char c: s.toCharArray()){
            hashMap.put(c, hashMap.getOrDefault(c,0)+1);
        }
        for(char c: t.toCharArray()){
            if(hashMap.containsKey(c)){
                if(hashMap.get(c) <= 0)
                    return false;
                hashMap.put(c, hashMap.get(c)-1);
            }
            else{
            return false;
            }
        }

        return true;
    }
}
