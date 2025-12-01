class Solution {
    public int minOperations(int[] nums) {
        int op = 0;

        int i = 0;
        int len = nums.length;
        while(i < len - 2){
            if(nums[i] == 0){
                nums[i] = nums[i] == 0 ? 1 : 0;
                nums[i+1] = nums[i+1] == 0 ? 1 : 0;
                nums[i+2] = nums[i+2] == 0 ? 1 : 0;
                op++;
            }
            i++;
        }

        if(nums[len-1] == 0 || nums[len-2] == 0)  return -1;
        return op;
    }
}