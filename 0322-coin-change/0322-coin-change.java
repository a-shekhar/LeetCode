class Solution {
    public int coinChange(int[] coins, int amount) {
       int[] dp = new int[amount+1];
        Arrays.fill(dp, amount + 1);  //can not have more than that
        dp[0] = 0;
        Arrays.sort(coins);
        for(int i = 1; i < amount + 1; i++){
            for(int coin : coins){
                if(coin > i) break;
                dp[i] = Math.min(dp[i], 1 + dp[i-coin]);
            }
        }
        //System.out.println(Arrays.toString(dp));
        return dp[amount] == amount + 1 ? -1 : dp[amount];
    }
}