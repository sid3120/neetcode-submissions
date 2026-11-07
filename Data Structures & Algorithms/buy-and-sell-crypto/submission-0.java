class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0 ;
        int maxSP = prices[prices.length -1];
        for(int i = prices.length - 2 ; i>=0 ; i--) {
            int profit = maxSP - prices[i];
            maxProfit = Math.max(maxProfit,profit);
            maxSP = Math.max(maxSP,prices[i]);
        }

        return maxProfit;
    } 
}
