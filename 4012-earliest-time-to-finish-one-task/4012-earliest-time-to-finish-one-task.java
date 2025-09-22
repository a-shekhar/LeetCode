class Solution {
    public int earliestTime(int[][] tasks) {
        int minSum = Integer.MAX_VALUE;
        for(int[] task : tasks){
            minSum = Math.min(minSum, task[0] + task[1]);
        }

        return minSum;
    }
}