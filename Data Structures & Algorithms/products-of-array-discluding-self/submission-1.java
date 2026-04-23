class Solution {
    public int[] productExceptSelf(int[] nums) {
    int[] arr = new int[nums.length];
    int pre = 1, pos = 1;
    for(int i = 0;i<nums.length;i++){
        arr[i] = pre;
        pre = nums[i]*pre;
    }

    for(int i = nums.length-1;i>=0;i--){
        arr[i] = arr[i]*pos;
        pos = pos*nums[i];
    }
    return arr;
    }
}  
