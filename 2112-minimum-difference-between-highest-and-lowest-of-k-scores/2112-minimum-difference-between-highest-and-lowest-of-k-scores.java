class Solution {
    public int minimumDifference(int[] nums, int k) {
        if(nums.length <= 1){
            return 0;
        }
        Arrays.sort(nums);
        int j = 0;
        int i = 0;
        int minDiff = Integer.MAX_VALUE;
        while(j < k - 1){
            j++;
        }

        while(j < nums.length){
            minDiff = Math.min(minDiff, nums[j] - nums[i]);
            i++;
            j++;
        }
        return minDiff;
    }
}