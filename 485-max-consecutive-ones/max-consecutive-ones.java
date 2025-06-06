class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxOnes = Integer.MIN_VALUE;
        int ones = 0;
        for(int num: nums){
            ones = (num == 1 ? ones + 1 : 0);
            maxOnes = Math.max(maxOnes, ones);
        }
        return maxOnes;
    }
}