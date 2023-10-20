class Solution {
    public int maxSum(int[] nums) {
        int[] maxDigits = new int[nums.length];
        int first;
        int second;
        int maxSum = -1;
        for(int i = 0;  i < nums.length-1; i++){
            if(maxDigits[i] == 0) {
                first = nums[i];
                while (first > 0) {
                    maxDigits[i] = Math.max(maxDigits[i], first % 10);
                    first /= 10;
                }
            }
            for(int j = i+1;  j < nums.length; j++){
                if(maxDigits[j] == 0) {
                    second = nums[j];
                    while (second > 0) {
                        maxDigits[j] = Math.max(maxDigits[j], second % 10);
                        second /= 10;
                    }
                }

                if(maxDigits[i] == maxDigits[j]){
                    maxSum = Math.max(maxSum, nums[i] + nums[j]);
                }
            }
        }
        return maxSum;
    }
}