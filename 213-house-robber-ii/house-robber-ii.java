class Solution {
   public int rob(int[] nums) {
        if(nums.length == 1){
            return nums[0];
        }
        int skipFirstHouse = robHelper(nums, 1, nums.length);
        int takeFirstHouse = robHelper(nums, 0, nums.length-1);
        return Math.max(skipFirstHouse, takeFirstHouse);
    }

    int robHelper(int[] nums, int start, int end){
        int len = end - start;
        if(len == 0){
            return 0;
        }
        if(len == 1){
            return nums[start];
        }
        int[] dp = new int[len];
        dp[0] = nums[start];
        dp[1] = Math.max(nums[start], nums[start + 1]);
        for(int i = 2 ; i < len; i++){
            dp[i] = Math.max(nums[start+i] + dp[i-2], dp[i-1]);
        }
        return dp[len-1];
    }
}