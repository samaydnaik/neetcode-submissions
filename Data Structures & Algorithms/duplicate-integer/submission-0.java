class Solution {
    public boolean hasDuplicate(int[] nums) {
        List<Integer>list = new ArrayList<>();
        for(int i = 0;i<nums.length;i++){
            if(list.isEmpty()){
                list.add(nums[i]);
            }
            else if(list.contains(nums[i])){
                return true;
            }
            else{
                list.add(nums[i]);
            }
        }
        return false;
    }
}
