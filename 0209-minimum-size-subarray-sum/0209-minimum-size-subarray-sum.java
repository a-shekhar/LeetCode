class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int i = 0, j = 0;
        int sum = 0;
        int minLen = nums.length + 1;
        while(j < nums.length){
            sum += nums[j];
            // once found minimize the range
            while(sum >= target){
                minLen = Math.min(minLen, j-i+1);
                sum -= nums[i];
                i++;
            }
            j++;
        }
        return minLen <= nums.length ? minLen : 0;
    }
}