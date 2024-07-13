class Solution {
    public int minimumOperations(int[] nums) {
        int result = 0;
        int rem;
        for(int num : nums){
            rem = num % 3;
            result += Math.min(rem, Math.abs(3-rem));
        }
        return result;
    }
}