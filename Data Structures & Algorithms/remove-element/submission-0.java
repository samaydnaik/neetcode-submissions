class Solution {
    public int removeElement(int[] nums, int val) {
     //calculate k
     int valueCounter = 0;
    for(int i: nums){
        if(val == i )
        valueCounter++;
    }
    int[] newArray = new int[nums.length-valueCounter];
    int j = 0;
    for(int i: nums){
        if(val != i )
       {newArray[j]= i;
        j++;
       }
    }
    int i = 0;
    for(int k: newArray){
        nums[i] = k;
        i++;
    }

    return nums.length-valueCounter;
    }
}