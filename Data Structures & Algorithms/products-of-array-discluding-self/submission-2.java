class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] pred = new int[nums.length];
        int[] succ = new int[nums.length];
        pred[0] = 1;
        succ[nums.length-1] = 1;
        for(int i = 1;i<nums.length;i++){
            pred[i] = pred[i-1]*nums[i-1];
        }
        int j = nums.length-2;
        while(j>=0){
            succ[j] = succ[j+1]*nums[j+1];
            j--;
        }
        for(int i = 0;i<nums.length;i++){
            succ[i] = succ[i]*pred[i];
        }
        return succ;
    }
}  
