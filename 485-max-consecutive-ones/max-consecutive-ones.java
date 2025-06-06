class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxOnes = Integer.MIN_VALUE;
        int ones = 0;
        for(int num: nums){
            if(num == 0){
                maxOnes = Math.max(maxOnes, ones);
                ones = 0;
            }else{
                ones++;
            }
        }
        return Math.max(maxOnes, ones);
    }
}