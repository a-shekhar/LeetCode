class Solution {
    public int maximumDifference(int[] nums) {
        int maxDiff = -1;
        int minElement = nums[0];
        for(int i=1; i < nums.length; i++){
            maxDiff = Math.max(nums[i] - minElement, maxDiff);
            minElement = Math.min(nums[i], minElement);
        }
        return maxDiff == 0 ? -1 : maxDiff;
    }
}