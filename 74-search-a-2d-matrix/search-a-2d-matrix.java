class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int low = 0;
        int n = matrix.length;
        int m = matrix[0].length;
        int high =  n *  m - 1;
        int mid;

        while(low <= high){
            mid = low + (high - low) / 2;
            //System.out.println(low + " " + high + " " + mid);

            int row = mid / m;
            int col = mid % m;
           // System.out.println(row + " " + col);
            if(matrix[row][col] == target){
                return true;
            } else if(matrix[row][col] > target){
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }
        return false;
    }
}