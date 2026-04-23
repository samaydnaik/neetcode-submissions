class Solution {
    public int maxArea(int[] heights) {
        int i = 0;
        int j = heights.length-1;
        int maxWater = 0;

        while(i<j){
            int minHeight = heights[j]>heights[i]? heights[i]:heights[j];
            int currWater = (j-i)*minHeight;
            if(currWater > maxWater) maxWater = currWater;
            if(heights[j]>heights[i])i++;
            else j--;
        }

        return maxWater;
    }
}
