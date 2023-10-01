class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxOnes = 0;
        int ones = 0;
        for(int num : nums){
            ones = num == 0 ? 0 : ones+1 ;
            maxOnes = Math.max(ones, maxOnes);
        }
        return maxOnes;
    }

}