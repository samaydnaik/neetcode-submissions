class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for(String word : strs){
            char[] arr = word.toCharArray();
            Arrays.sort(arr);
            String sortedString = new String(arr);
            if(!map.containsKey(sortedString)){
                map.put(sortedString, new ArrayList<>());
            }
            map.get(sortedString).add(word);
        }

        return new ArrayList<>(map.values());
    }
}
