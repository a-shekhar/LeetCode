class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int min;
        for(int i=1; i<prices.length; i++){
            min = Math.min(prices[i-1], prices[i]);
            maxProfit += Math.max(0, prices[i] - min);
        }
        return maxProfit;
    }
}