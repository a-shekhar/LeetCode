class Solution {
    public int maxProfit(int[] prices) {

        int maxProfit = Integer.MIN_VALUE;
        int minPrice = prices[0];
        int profit;

        for(int i = 1; i < prices.length; i++){
            minPrice = Math.min(minPrice, prices[i]);
            profit = prices[i] - minPrice;
            maxProfit = Math.max(maxProfit, profit);
        }
        
        return maxProfit < 0 ? 0 : maxProfit;
    }
}