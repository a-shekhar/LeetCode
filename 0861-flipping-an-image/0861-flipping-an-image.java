class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int n = image.length; 
        int[][] ans = new int[n][n];
        int[] temp;
        int index;
        int mainIndex = 0;
        for(int i = 0; i < n; i++){
            temp = new int[n];
            index = 0;
            for(int j = n-1; j >= 0; j--){
               temp[index++] = image[i][j] == 0 ? 1 : 0; 
              // index++;
            }
            ans[mainIndex++] = temp;
            //mainIndex++;
        }
        return ans;
    }
}