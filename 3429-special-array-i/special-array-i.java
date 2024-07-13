class Solution {
    public boolean isArraySpecial(int[] nums) {
        for(int i = 1; i < nums.length; i++){
            int first = nums[i] % 2;
            int second =  nums[i-1] % 2;
            if(first == second){
                return false;
            }
        }
        return true;
    }
}