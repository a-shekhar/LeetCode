class Solution {
    public int minDistance(String word1, String word2) {
        int n = word1.length();
        int m = word2.length();
        int[][] dp = new int[n][m];
        for(int i = 0; i < n; i++){
            Arrays.fill(dp[i], -1);
        }
        return findMinDistance(word1, word2, 0, 0, dp);
    }

    private int findMinDistance(String word1, String word2, int i, int j, int[][] dp) {
         if (i == word1.length()) return word2.length() - j;  // need to insert remaining chars of w2
        if (j == word2.length()) return word1.length() - i;  // need to delete remaining chars of w1

        if(dp[i][j] != -1) return dp[i][j];

       if(word1.charAt(i) == word2.charAt(j)){
           return dp[i][j] = findMinDistance(word1, word2, i+1, j+1, dp);
       }

       int insert = findMinDistance(word1, word2, i, j + 1, dp);
       int replace = findMinDistance(word1, word2, i + 1, j + 1, dp);
       int delete = findMinDistance(word1, word2, i + 1, j, dp);

       dp[i][j] = 1 + Math.min(insert, Math.min(replace, delete));
       return dp[i][j];
    }
}