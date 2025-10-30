class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
         List<Integer> list = new ArrayList<>();
        int n = matrix.length-1;
        int m = matrix[0].length-1;
        int row = 0;
        int col = 0;
        while(row <= n && col <= m){
            // left to right 
            for(int j = col; j <= m; j++){
                list.add(matrix[row][j]);
            }
            row++;

            // top to down
            for(int j = row; j <= n; j++){
                list.add(matrix[j][m]);
            }
            m--;

            // right to left
            if(n >= row){
                for(int j = m; j >= col; j--){
                    list.add(matrix[n][j]);
                }
            }
            n--;

            // bottom to top 
            if(m >= col){
                for(int j = n; j >= row; j--){
                    list.add(matrix[j][col]);
                }
            }
            col++;


        }
        return list;
    }
}