class Solution {
    public int diagonalSum(int[][] mat) {
        int sum = 0;
        int n = mat.length;
        for(int i = 0; i < mat.length; i++){
          sum += mat[i][i]  + mat[i][n-i-1];
          System.out.println(sum);
        }
       
        if(n % 2 == 1){
          sum -= mat[n/2][n/2]; 
        }
        return sum;
    }
}