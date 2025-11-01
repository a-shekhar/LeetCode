class Solution {
     public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];
        for(int i = 0; i < m; i++){
            Arrays.fill(dp[i], -1);
        }
        return findPath(0, 0, m, n, dp);
        //return dp[m-1][n-1];
    }

    

    private int findPath(int i, int j, int m, int n, int[][] dp) {
        if(i < 0 || j < 0 || i >= m || j >= n){
            return 0;
        }

        if(i == m-1 && j == n-1){
            //dp[i][j] = 1;
            return 1;
        }

        if(dp[i][j] != -1) return dp[i][j];

        int x = findPath(i+1, j, m, n, dp);
        int y = findPath(i, j+1, m, n, dp);
        dp[i][j] = x + y;
        return dp[i][j];
    }
}