class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int count = 1;
        int maxCount = 1;
        for(int i=1; i<nums.length; i++){
            count = nums[i] <= nums[i-1] ? 1 : count + 1;
            maxCount = Math.max(count, maxCount);
        }
        return maxCount;
    }
}