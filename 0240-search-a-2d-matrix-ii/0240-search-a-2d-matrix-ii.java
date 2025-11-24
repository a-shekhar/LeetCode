class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length;
        int m = matrix[0].length;
        int row = 0;
        int col = m - 1;

        while(row < n && col >= 0){

            //System.out.println(low + " " + high + " " + mid + " "  + row + " " + col);

            if(matrix[row][col] == target){
                return true;
            }

            if(matrix[row][col] > target){
                col--;
            } else {
                row++;
            }
        }

        return false;
    }
}