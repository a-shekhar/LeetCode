class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int row = 0;
        int count = 0;
        int maxCount = 0;
        for(int i = 0 ;  i< mat.length; i++){
            count = 0;
            for(int j = 0; j < mat[i].length; j++){
                if(mat[i][j] == 1){
                    count++;
                }
            }

            if(count > maxCount){
                maxCount = count;
                row = i;
            }
        }
        return new int[] {row, maxCount};
    }
}