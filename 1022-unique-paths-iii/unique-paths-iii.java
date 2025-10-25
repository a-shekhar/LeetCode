class Solution {
    public int uniquePathsIII(int[][] grid) {
        int empty = 0;
        int n = grid.length;
        int m = grid[0].length;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(grid[i][j] == 0) empty++;
            }
        }


        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(grid[i][j] == 1) 
                    return dfs(grid, n, m, i, j, empty);
            }
        }

        return -1;
    }

    private int dfs(int[][] grid, int n, int m, int i, int j, int empty) {
        if(i < 0 || j < 0 || i >= n || j >= m || grid[i][j] == -1){
            
            return 0;
        }

        if(grid[i][j] == 2){
            if(empty == 0) return 1;
            return 0;
        }

        int num = grid[i][j];
        grid[i][j] = -1;
        if(num == 0) empty--;

        int a =  dfs(grid, n, m, i-1, j, empty);
        int b =  dfs(grid, n, m, i+1, j, empty);
        int c =  dfs(grid, n, m, i, j-1, empty);
        int d = dfs(grid, n, m, i, j+1, empty);

        // backtracking
        if(num == 0) {
            grid[i][j] = 0;
            empty++;
        }

        return a + b + c + d; 
    }
}