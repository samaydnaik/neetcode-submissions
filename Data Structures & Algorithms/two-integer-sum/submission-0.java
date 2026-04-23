class Solution {
    public int[] twoSum(int[] nums, int target) {
        /*
        go through each number, subtract from target 
        and add it into hashMap of subtracted value and number
        position.
        For each number, check if it's in hashMap ,
        then return it's value and current number position
        */
        int[] result = new int[2];
        Map<Integer, Integer>map = new HashMap<>();
        for(int i = 0;i<nums.length;i++){
            if(map.containsKey(nums[i]))
            {
                result[0] = map.get(nums[i]);
                result[1] = i;
            } else{
                map.put(target-nums[i], i);
            }
        }


        return result;
    }
}
