class Solution {
    public int pivotIndex(int[] nums) {
        int sum = 0;
        int tempSum = 0;
        for(int num:nums){
            sum += num;
        }

        for(int i =0; i<nums.length; i++){
            if(tempSum == sum - nums[i]){
                return i;
            }
            tempSum += nums[i];
            sum -= nums[i];
        }
        return -1;
    }
}