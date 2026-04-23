class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] ans = new int[nums.length];
        for(int i = 0;i<nums.length;i++){
         int prefSum = calc(0, i, nums);
         int suffSum = calc(i+1, nums.length, nums);
         ans[i] = prefSum*suffSum;   
        }

        return ans;
    }

    public int calc(int start, int end, int[] arr){
        int sum = 1;
        for(int i = start; i<end;i++){
            sum *= arr[i];
        }
        return sum;
    }
}  
