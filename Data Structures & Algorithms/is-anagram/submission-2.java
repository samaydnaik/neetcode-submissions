class Solution {
    public boolean isAnagram(String s, String t) {
        /*
        convert both string to charArrays
        add first string to hashMap with occurrences

        then go through second string
        reduce the count from hashMap
        */
        char[] s1 = s.toCharArray();
        char[] t1 = t.toCharArray();
        if(s1.length!=t1.length)
        return false;
        Map<Character, Integer> map = new HashMap<>();
        for(int i = 0;i<s1.length;i++){
            map.put(s1[i], map.getOrDefault(s1[i],0)+1);
        }
        for(int j = 0;j<t1.length;j++){
            if(map.containsKey(t1[j])){
                map.put(t1[j],map.get(t1[j])-1);
            }
        }

        for(Map.Entry<Character, Integer>m1: map.entrySet()){
            if(m1.getValue()!=0)
            return false;
        }
        return true;
    }
}
