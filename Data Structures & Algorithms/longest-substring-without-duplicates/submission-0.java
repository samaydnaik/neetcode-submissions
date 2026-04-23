class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character>result = new HashSet<>();
        int maxLength = 0;
        int startPoint = 0;
        for(int i = 0;i<s.length();i++){
           while(result.contains(s.charAt(i))){
            result.remove(s.charAt(startPoint));
            startPoint++;
           }
           result.add(s.charAt(i));
           maxLength = Math.max(maxLength,result.size());
        }
    return maxLength;
    }
}
