class Solution {
public:
    int islandPerimeter(vector<vector<int>>& grid) {
        int r = grid.size();
    int c = grid[0].size();
    
    int perimeter = 0;
    
    for(int i = 0;i<r;i++){
        for(int j=0;j<c;j++){
            perimeter += getSides(grid, i, j);
        }
    }
    
    return perimeter;

    }

    int getSides(vector<vector<int>>&grid, int i, int j){
    if(grid[i][j] == 0){
        return 0;
    }
    
    int row = grid.size();
    int col = grid[0].size();
    
    int edges = 0;
    //up
    if(i == 0 || grid[i-1][j] == 0){
        edges++;
    }
    //below
    if(i == row-1 || grid[i+1][j] == 0){
        edges++;
    }
    //left
    if(j == 0 || grid[i][j-1] == 0){
        edges++;
    }
    //right
    if(j == col-1 || grid[i][j+1] == 0){
        edges++;
    }
    return edges;
}

};