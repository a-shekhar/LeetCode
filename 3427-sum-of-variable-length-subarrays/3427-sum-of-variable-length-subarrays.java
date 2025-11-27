class Solution {
    public int subarraySum(int[] nums) {
        int sum = nums[0];
        int prefixSum = 0;
        int[] sumSoFar = new int[nums.length];

        int i = 0;
        int j = 1;
        int resSum = sum;
        while(j < nums.length){
            sum += nums[j];
            prefixSum += nums[i];
            sumSoFar[i] = prefixSum;
            int x = Math.max(0, j- nums[j]);
            if(x == 0) resSum += sum;
            else resSum += sum - sumSoFar[x-1];
            i++;
            j++;
        }

        return resSum;
    }
}