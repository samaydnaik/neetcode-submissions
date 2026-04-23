class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer>hashSet = new HashSet<>();
        for(int i = 0;i<nums.length;i++){
            hashSet.add(nums[i]);
        }

        return nums.length != hashSet.size();
    }
}