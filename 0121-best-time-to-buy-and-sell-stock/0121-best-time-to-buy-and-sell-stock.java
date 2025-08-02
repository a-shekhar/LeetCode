class Solution {
    public int maxProfit(int[] prices) {
            int maxProfit = 0;
            int profit = 0;
            int minPrice = Integer.MAX_VALUE; 
            for(int price : prices){
                minPrice = Math.min(minPrice, price);
                profit = Math.max(0, price - minPrice);
                maxProfit = Math.max(maxProfit, profit);
            }
        return maxProfit;
    }
}