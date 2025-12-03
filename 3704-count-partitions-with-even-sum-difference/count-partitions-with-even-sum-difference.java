class Solution {
    public int countPartitions(int[] nums) {
         int suffixSum = 0;
        int prefixSum = 0;
        int count = 0;

        for(int num : nums){
            suffixSum += num;
        }

        for(int i = 0; i < nums.length-1; i++){
            prefixSum += nums[i];
            suffixSum -= nums[i];
            if((prefixSum - suffixSum) % 2 == 0) count++;
        }

        return count;
    }
}