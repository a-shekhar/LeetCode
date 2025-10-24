class Solution {
    public int getMaximumGold(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int maxGold = 0;

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(grid[i][j] != 0){
                    int gold  = solve(grid, n, m, i, j, 0);
                    maxGold = Math.max(maxGold, gold);
                }
            }
        }

        return maxGold;
    }

    private int solve(int[][] grid, int n, int m, int i, int j, int sum) {
        if(i < 0 || j < 0 || i >= n || j >= m || grid[i][j] == 0){
            return 0;
        }

        int num = grid[i][j];
        sum += num;
        grid[i][j] = 0;

        int a = solve(grid, n, m, i + 1, j, sum);
        int b = solve(grid, n, m, i - 1, j, sum);
        int c = solve(grid, n, m, i, j + 1, sum);
        int d = solve(grid, n, m, i, j - 1, sum);

        // backtracking
        grid[i][j] = num;

        return num + Math.max(Math.max(a,b), Math.max(c,d));
    }
}