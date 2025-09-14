class Solution {
    public int maxSubArray(int[] nums) {
       if(nums.length == 0){
            return 0;
        }

        int currSum = 0;
        int maxSum = nums[0]; 

        for(int num : nums){
            currSum = Math.max(num, num + currSum);
            maxSum = Math.max(currSum, maxSum);
        } 
        
        return maxSum; 
    }
}