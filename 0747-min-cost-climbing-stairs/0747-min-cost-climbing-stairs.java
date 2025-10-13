class Solution {
     public int minCostClimbingStairs(int[] cost) {

        int[] dp = new int[cost.length+1];
        Arrays.fill(dp, -1);
        int startFormZero = calculate(cost, dp, 0);
        int startFormOne = calculate(cost, dp, 1);
        return Math.min(startFormZero, startFormOne);
    }

    private int calculate(int[] cost, int[] dp, int i) {
        if(i >= cost.length){
            return 0;
        }

        if(dp[i] != -1){
            return dp[i];
        }

        // count and jump 1 step
        int val1 = cost[i] + calculate(cost, dp, i+1);
        // count and jump 2 step
        int val2 = cost[i] + calculate(cost, dp, i+2);

        dp[i] = Math.min(val1, val2);

        return dp[i];
    }
}