class Solution {
    public void sortColors(int[] nums) {
        int max = -1;
        for(int i = 0;i<nums.length;i++){
            if(nums[i] > max) max = nums[i];
        }
        //[2,1,0] -> max = 2
        //counts = [3] -> [0, 1, 2]
        /*                [1, 1, 1]

        */

        int[] counts = new int[max+1];
        for(int i = 0;i<max+1;i++){
            counts[i] = 0;
        }
        for(int i = 0;i<nums.length;i++){
            counts[nums[i]]++;
        }
        int index = 0;
        for(int k = 0;k<max+1;k++){
            for(int j = 0;j<counts[k];j++){
                nums[index] = k;
                index++;
            }
        }

    }
}