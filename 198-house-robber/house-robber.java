class Solution {
    public int rob(int[] val) {
            int n = val.length;
        if(n==0){
            return 0;
        }
        if(n == 1){
            return val[0];
        }
        if(n ==2){
            return Math.max(val[0], val[1]);
        }
        int[] dp = new int[n];
        dp[0] = val[0];
        dp[1] = Math.max(val[0], val[1]);
        for(int i = 2; i<n; i++){
            dp[i] = Math.max(val[i]+ dp[i-2], dp[i-1]);
        }
        return dp[n-1];

    }
}