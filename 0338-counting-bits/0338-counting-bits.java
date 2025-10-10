class Solution {
    public int[] countBits(int n) {
        int[] dp = new int[n+1];

        for(int i = 1;  i <= n; i++){
            int half =  i / 2;
            if(i % 2 == 0){
                dp[i] = dp[half];
            } else {
                dp[i] = dp[half] + 1;
            }
        }
        return dp;
    }
}