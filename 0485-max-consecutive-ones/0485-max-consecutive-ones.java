class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int maxCount = 0; 
        for(int num : nums){
            count = (num == 0 ? 0 : count+1);
            maxCount = Math.max(count, maxCount);
        }
        return maxCount;
    }
}