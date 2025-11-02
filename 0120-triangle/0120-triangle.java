class Solution {
     public int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size();
        int[][] dp = new int[n][n];
        for(int i = 0; i < n; i++){
            Arrays.fill(dp[i], Integer.MIN_VALUE);
        }
        return findMin(triangle, 0, 0, dp);
    }

    private int findMin(List<List<Integer>> triangle, int index, int i, int[][] dp) {
        if(index >= triangle.size() || i >= triangle.get(index).size()){
            return 0;
        }


        if(dp[index][i] != Integer.MIN_VALUE){
            return dp[index][i];
        }
      

        int x = findMin(triangle, index+1, i, dp);
        int y = findMin(triangle, index+1, i+1, dp);

          
        dp[index][i] = triangle.get(index).get(i) + Math.min(x, y);
        return dp[index][i];
    }
}