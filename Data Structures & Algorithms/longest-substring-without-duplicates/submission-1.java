class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLength = 0;
        int i = 0;
        Set<Character> charSet = new HashSet<>();
        int j = 0;
        while(i<s.length()){
            if(charSet.contains(s.charAt(i))){
                charSet.remove(s.charAt(j));
                j++;
            } else {
                charSet.add(s.charAt(i));
                maxLength = Math.max(maxLength,i-j+1);
                i++;
            }
        }

        return maxLength;
    }
}
