class Solution {
         public static int islandPerimeter(int[][] grid) {
        int perimeter = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 1) {
                    int mc= modularCount(grid, i, j);
                    perimeter += mc;
                }
            }
        }
        return perimeter;
    }

    private static int modularCount(int[][] grid, int x, int y) {
        int res = 0;
        int posx = x;
        int posy = y;

        x -= 1;
        if (x < 0) res += 1;
        else {
            if (grid[x][y] == 0) res += 1;
        }

        x = posx;

        y -= 1;
        if (y < 0) res += 1;
        else {
            if (grid[x][y] == 0) res += 1;
        }

        y = posy;

        y+=1;
        if (y >= grid[0].length)
            res += 1;
        else {
            if (grid[x][y] == 0) res += 1;
        }

        y = posy;

        x+=1;
        if (x >= grid.length)
            res += 1;
        else {
            if (grid[x][y] == 0) res += 1;
        }

        return res;
    }
}