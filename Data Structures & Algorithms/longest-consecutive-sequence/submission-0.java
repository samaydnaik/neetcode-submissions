class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new TreeSet<>();
        for(int i = 0;i<nums.length;i++){
            set.add(nums[i]);
        }
        int max_length = 0;
        for(int a : set){
            if(!set.contains(a-1)){
                int length = 1;
                while(set.contains(a+length))
                length++;
                max_length = Math.max(max_length, length);
            }
        }

        return max_length;
    }
}
