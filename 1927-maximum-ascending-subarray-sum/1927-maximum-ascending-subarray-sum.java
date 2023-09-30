class Solution {
    public int maxAscendingSum(int[] nums) {
        if(nums.length == 1){
            return nums[0];
        }
        int maxSum = 0;
        int sum = 0;
        for(int i=0; i<nums.length-1; i++){
            if(nums[i] >= nums[i+1]){
                sum += nums[i];
                maxSum = Math.max(sum, maxSum);
                sum = 0;
            }else{
                sum += nums[i];
            }
        }
        if(nums[nums.length-1] > nums[nums.length-2]){
            maxSum = Math.max(sum+nums[nums.length-1], maxSum);
        }else{
            maxSum = Math.max(nums[nums.length-1], maxSum);
        }
        return maxSum;
    }

}