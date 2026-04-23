class Solution {
    public int maxProfit(int[] prices) {
        int maxSoldPrice = 0;
        int buyPrice = Integer.MAX_VALUE;
        for(int i = 0;i<prices.length-1;i++){
            if(buyPrice>prices[i]){
                buyPrice = prices[i];
            }
            if(prices[i+1]-buyPrice > maxSoldPrice)
            maxSoldPrice = prices[i+1]-buyPrice;
        }

        return maxSoldPrice;
    }
}
