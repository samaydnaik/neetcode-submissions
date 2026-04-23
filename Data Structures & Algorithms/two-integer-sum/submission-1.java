class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer>hashMap = new HashMap<>();
        int[] result = new int[2];
        for(int i = 0;i<nums.length;i++){
            if(!hashMap.containsKey(nums[i])){
                hashMap.put(target-nums[i],i);
            } else{
                result[0] = hashMap.get(nums[i]);
                result[1] = i;
            }
        }

        return result;
    }
}
