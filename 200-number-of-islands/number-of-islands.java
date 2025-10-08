class Solution {
    public int numIslands(char[][] grid) {
        int row = grid.length;
        int col;
        int count = 0;

        for(int i = 0; i < row; i++){
            col = grid[i].length;
            for(int j = 0; j < col; j++){
                if(grid[i][j] == '1'){
                    dfs(grid, i, j, row, col);
                    count++;
                }
            }
        }
        return count;
    }

    private void dfs(char[][] grid, int i, int j, int row, int col){
        if(i < 0 || j < 0 || i >= row || j >= col || grid[i][j] == '0'){
            return;
        }

        grid[i][j] = '0'; // mark as visited
        //grid[i][j-1] = 0; // mark as visited
        //grid[i+1][j] = 0; // mark as visited
        //grid[i-1][j] = 0; // mark as visited

        dfs(grid, i - 1, j, row, col);
        dfs(grid, i + 1, j, row, col);
        dfs(grid, i, j - 1, row, col);
        dfs(grid, i, j + 1, row, col);
    }
}