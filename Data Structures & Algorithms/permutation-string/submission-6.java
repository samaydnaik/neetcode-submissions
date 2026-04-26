class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length())return false;
        
        HashMap<Character,Integer> map = new HashMap<>();
        for(char c : s1.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
           int need = map.size();
       for(int i = 0;i<s2.length();i++){
        HashMap<Character,Integer> map2 = new HashMap<>();

        int curr = 0;
        for(int j = i;j<s2.length();j++){
            char c = s2.charAt(j);
            map2.put(c,map2.getOrDefault(c,0)+1);
            if(map.getOrDefault(c,0)<map2.get(c))break;

            if(map.getOrDefault(c,0) == map2.get(c)) curr++;

            if(curr == need) return true;
        }
    }
        return false;
    
}
}
