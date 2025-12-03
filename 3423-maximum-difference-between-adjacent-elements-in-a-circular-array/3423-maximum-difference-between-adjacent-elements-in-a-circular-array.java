class Solution {
    public int maxAdjacentDistance(int[] nums) {
        int maxVal = Integer.MIN_VALUE;
        int n = nums.length;
        for(int i = 1; i < n; i++){
            maxVal = Math.max(maxVal, Math.abs(nums[i-1] - nums[i]));
        }

        return Math.abs(Math.max(maxVal, Math.abs(nums[n-1] - nums[0])));
    }
}