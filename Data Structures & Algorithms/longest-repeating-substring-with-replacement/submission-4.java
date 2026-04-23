class Solution {
    public int characterReplacement(String s, int k) {
        HashSet<Character>set = new HashSet<>();
        int maxLength = 0;
        for(int i = 0;i<s.length();i++){
            set.add(s.charAt(i));
        }
        Map<Character, Integer>map = new HashMap<>();

            int count = 0, l = 0,maxf = 0;
            for(int r = 0;r<s.length();r++){
                map.put(s.charAt(r), map.getOrDefault(s.charAt(r),0)+1);
                maxf = Math.max(maxf, map.get(s.charAt(r)));

                while(r - l + 1 - maxf > k ){
                map.put(s.charAt(l), map.get(s.charAt(l))-1);
                    l++;
                }

                maxLength = Math.max(maxLength, r-l+1);
            }
        

        return maxLength;

    }
}
