class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        List<Integer> ans = new ArrayList<>();
        SortedMap<Integer, Integer> map = new TreeMap<>();
        for(int i = 0;i<nums.length;i++){
            map.put(nums[i], map.getOrDefault(nums[i],0)+1);
        }
        PriorityQueue<Map.Entry<Integer, Integer>>heap = new PriorityQueue<>(
            (a,b) -> Integer.compare(b.getValue(),a.getValue())
        );

        for(Map.Entry<Integer,Integer>value: map.entrySet()){
            heap.offer(value);
        }

        int[] res = new int[k];
        for(int i = 0;i<k;i++)
        res[i] = heap.poll().getKey();

        return res;

    }
}
