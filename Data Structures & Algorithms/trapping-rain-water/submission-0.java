class Solution {
    public int trap(int[] height) {
        int maxL = height[0];
        int maxR = height[height.length-1];
        int L = 0;
        int waterTrap = 0;
        int R = height.length - 1;
        while(L<R){
           if(height[L] <= height[R]){
                if(maxL<height[L]){
                    maxL = height[L];
                }else{
                    waterTrap += maxL-height[L]; 
                }
                L++;
           } else {
            if(maxR<height[R]){
                    maxR = height[R];
                }else{
                    waterTrap += maxR-height[R]; 
                }
            R--;
           }
         
        }

        return waterTrap;
    }
}
