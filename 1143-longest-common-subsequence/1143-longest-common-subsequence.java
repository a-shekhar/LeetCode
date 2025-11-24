class Solution {
     
    public int longestCommonSubsequence(String text1, String text2) {
        int[][] dp = new int[text1.length()][text2.length()];

        for(int i = 0; i < text1.length(); i++){
            Arrays.fill(dp[i], -1);
        }
        solve(text1, text2, dp, 0, 0);

        return dp[0][0];
    }

     private int solve(String text1, String text2, int[][] dp, int i, int j) {
        if(i >= text1.length() || j >= text2.length()){
            return 0;
        }

        if(dp[i][j] != -1){
            return dp[i][j];
        }

        if(text1.charAt(i) == text2.charAt(j)){
            dp[i][j] = 1 + solve(text1, text2, dp, i+1, j+1);
        } else {
            int skipA = solve(text1, text2, dp, i+1, j);
            int skipB = solve(text1, text2, dp, i, j+1);
            dp[i][j] = Math.max(skipA, skipB);
        }

        
        return dp[i][j];
    }
}