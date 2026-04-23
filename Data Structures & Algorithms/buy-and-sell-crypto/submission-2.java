class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int bPrice = Integer.MAX_VALUE;

        for(int i = 0;i<prices.length;i++){
            if(prices[i]<bPrice)
            bPrice = prices[i];
            else if(maxProfit < prices[i] - bPrice)
            maxProfit = prices[i] - bPrice; 
        }

        return maxProfit;
    }
}
