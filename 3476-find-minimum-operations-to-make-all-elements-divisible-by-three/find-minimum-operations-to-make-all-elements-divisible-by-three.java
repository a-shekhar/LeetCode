class Solution {
    public int minimumOperations(int[] nums) {
        int minOp = 0;
        for(int num : nums){
            int rem = num % 3;
            minOp += Math.min(rem, 3 - rem);
        }
        return minOp;
    }
}