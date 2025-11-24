class Solution {
    public int minDistance(String word1, String word2) {
        int m = word1.length();
        int n = word2.length();
        int[][] dp = new int[m][n];
        for(int i = 0; i < m; i++){
            Arrays.fill(dp[i], -1);
        }
        int maxMatch = solve(word1, word2, 0, 0, dp);
        return (m - maxMatch) + (n - maxMatch);
    }
         
    private int solve(String word1, String word2, int i, int j, int[][] dp) {
        if(i >= word1.length() || j >= word2.length()){
            return 0;
        }

        if(dp[i][j] != -1) return dp[i][j];

        if(word1.charAt(i) == word2.charAt(j)){
            dp[i][j] = 1 + solve(word1, word2, i+1, j+1, dp);
        } else {
            int skipA = solve(word1, word2, i+1, j, dp);
            int skipB = solve(word1, word2, i, j+1, dp);
            dp[i][j] = Math.max(skipA, skipB);
        }
        return dp[i][j];
    }
}