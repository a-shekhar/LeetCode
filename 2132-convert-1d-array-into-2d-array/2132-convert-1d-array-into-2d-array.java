class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {
        if(original.length != m * n){
            return new int[0][0];
        }
        int index = 0; 
        int[][] modified = new int[m][n];
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                modified[i][j] = original[index];
                index++;
            }
        }
        return modified;
    }
}