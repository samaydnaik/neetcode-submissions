class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> group = new HashMap<>();
        ArrayList<Integer> resultInList = new ArrayList<>();
        for(int i : nums){
            group.put(i, group.getOrDefault(i,0)+1);
        }

        Map<Integer, Integer> resultNew = group.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
        .collect(Collectors.toMap(Map.Entry::getKey,
        Map.Entry::getValue,
        (e1, e2)->e1,
        LinkedHashMap::new));

        int count = 0;
        for(Map.Entry<Integer, Integer> map: resultNew.entrySet()){
            if(count == k)
            break;
            resultInList.add(map.getKey());
            count++;
        }

        int[] result = new int[resultInList.size()];
        for(int i = 0;i<resultInList.size();i++){
            result[i] = resultInList.get(i);
        }

        return result;
    }
}
