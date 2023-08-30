class Solution {
    
    public int climbStairs(int n) {
        if(n <= 2){
            return n;
        }
        int[] dp = new int[n+1];
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 2;
        return calculate(n, dp);
    }

    public int calculate(int n, int[] dp){
        if(dp[n] != 0){
            return dp[n];
        }
        dp[n] = calculate(n-1,dp) + calculate(n-2, dp); 
        return dp[n];
    }
}