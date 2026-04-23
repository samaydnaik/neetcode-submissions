class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> hashMap = new HashMap<>();
        for(int i =0;i<s.length();i++){
            hashMap.put(s.charAt(i), hashMap.getOrDefault(s.charAt(i),0)+1);
        }

    for(int i =0;i<t.length();i++){           
     if(hashMap.containsKey(t.charAt(i)))
            hashMap.put(t.charAt(i), hashMap.get(t.charAt(i))-1);
            else{
                return false;
            }
        }

        for(Map.Entry<Character, Integer>map: hashMap.entrySet()){
            if(map.getValue() > 0)
            return false;
        }

        return true;
    }
}
