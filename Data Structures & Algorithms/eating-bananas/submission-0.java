class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int maxRate = 0;
        for(int i = 0;i<piles.length;i++){
            if(piles[i]>maxRate){
                maxRate = piles[i];
            }
        }        

        int l = 1;
        int r = maxRate;
        int minRateFound = 0;

        while(l<=r){
            int mid = (l+r)/2;
            int hoursTaken = 0;
            for(int i = 0;i<piles.length;i++){
                hoursTaken+= Math.ceil((double)piles[i]/mid);
            }
            if(hoursTaken > h){
                l = mid+1;
            } else if(hoursTaken <= h){
                minRateFound = mid;
                r = mid - 1;
            } 
        }

        return minRateFound;

    }
}

