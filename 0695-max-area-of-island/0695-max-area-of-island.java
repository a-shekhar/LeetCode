class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int row = grid.length;
        int col;
        int maxArea = 0;

        for(int i = 0; i < row; i++){
            col = grid[i].length;
            for(int j = 0; j < col; j++){
                if(grid[i][j] == 1){
                    int count = dfs(grid, i, j, row, col);
                    maxArea = Math.max(maxArea, count);
                }
            }
        }
        return maxArea;
    }

    private int dfs(int[][] grid, int i, int j, int row, int col){
        if(i < 0 || j < 0 || i >= row || j >= col || grid[i][j] == 0){
            return 0;
        }

        grid[i][j] = 0; // mark as visited
        int count = 1;

        count += dfs(grid, i - 1, j, row, col);
        count += dfs(grid, i + 1, j, row, col);
        count += dfs(grid, i, j - 1, row, col);
        count += dfs(grid, i, j + 1, row, col);
        return count;
    }
}