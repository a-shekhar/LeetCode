class Solution {
    public boolean canJump(int[] nums) {
        int finalDest = nums.length - 1;
        for(int i = nums.length - 2; i >= 0; i--){
            if(i + nums[i] >= finalDest){
                finalDest = i;
            }
        }
        return finalDest == 0;
    }
}