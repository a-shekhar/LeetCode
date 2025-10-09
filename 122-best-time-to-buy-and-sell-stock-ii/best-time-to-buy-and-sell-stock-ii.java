class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int minPrice = prices[0];

        for(int i = 0;  i < prices.length; i++){
            if(prices[i] - minPrice > 0){

                maxProfit += prices[i] - minPrice;
                minPrice = prices[i];

                //minPrice = Integer.MAX_VALUE;
            }  else {
                 minPrice = Math.min(minPrice, prices[i]);
            }  
           // } else if(minPrice == Integer.MAX_VALUE){
           //     minPrice = prices[i];
           // }
        }

        return maxProfit;
    }
}