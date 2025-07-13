class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        int[] prefixSum = new int[nums.length];
        int[] suffixSum = new int[nums.length];

        prefixSum[0] = nums[0];
        for(int i = 1; i < nums.length; i++){
            prefixSum[i] =  prefixSum[i-1] * nums[i];
        }

        suffixSum[nums.length-1] = nums[nums.length-1];
        for(int i = nums.length - 2; i >= 0; i--){
            suffixSum[i] = suffixSum[i+1] * nums[i];
        }

        result[0] = suffixSum[1] * 1; // since i - 1 will be -1, so
        for(int i = 1; i < nums.length - 1; i++){
            result[i] = prefixSum[i-1] * suffixSum[i+1];
        }
        result[nums.length - 1] = prefixSum[nums.length-2] * 1; // since i - 1 will be out of index, so
        return result;
    }
}