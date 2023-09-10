class Solution {
    public int[] finalPrices(int[] prices) {
        int[] sell = new int[prices.length];
        for(int i = 0;  i < prices.length ; i++){
            sell[i] = prices[i];
            for(int j = i+1;  j < prices.length; j++){
                if(prices[j] <= prices[i]){
                    sell[i] = prices[i] - prices[j];
                    break;
                }
            }
            
        }
        return sell;
    }
}