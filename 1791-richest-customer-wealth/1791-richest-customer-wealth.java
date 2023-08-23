class Solution {
    public int maximumWealth(int[][] accounts) {
        int maxsum = 0;
        for(int i = 0; i < accounts.length; i++){
            int sum = 0;
            for(int j = 0; j < accounts[i].length; j++){
                sum += accounts[i][j];
            }
            maxsum = Math.max(maxsum, sum);
        }
        return maxsum;
    }
}