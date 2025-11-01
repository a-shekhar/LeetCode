class Solution {
    
     public int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[][] dp = new int[m][n];
        for(int i = 0; i < m; i++){
            Arrays.fill(dp[i], -1);
        }

        return  findPath(0, 0, m, n, grid, dp);
    }



    private int findPath(int i, int j, int m, int n, int[][] grid, int[][] dp) {
        if(i < 0 || j < 0 || i >= m || j >= n){
            return  Integer.MAX_VALUE;
        }


        if(dp[i][j] != -1) return dp[i][j];

        if(i == m-1 && j == n-1){
            return dp[i][j] = grid[i][j];
        }

        int x = findPath(i+1, j, m, n, grid, dp);
        int y = findPath(i, j+1, m, n, grid, dp);
        
        dp[i][j] = grid[i][j] + Math.min(x, y);
        return dp[i][j];
    }

}