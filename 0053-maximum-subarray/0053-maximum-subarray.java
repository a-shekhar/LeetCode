class Solution {
    public int maxSubArray(int[] nums) {
        int currsum = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int num : nums){
            currsum = Math.max(num, currsum + num);
            maxSum = Math.max(maxSum, currsum);
        }

        return maxSum;
    }
}