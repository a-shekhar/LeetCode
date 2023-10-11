class Solution {
     public void moveZeroes(int[] nums) {
        int zeros = 0;
        int n = nums.length;
        int temp = 0;
        for(int i = 0;  i < n; i++){
            if(nums[i] != 0){
                nums[temp] = nums[i];
                temp++;
            }else{
                zeros++;
            }
        }

        n = nums.length - 1;
        while(zeros > 0){
            nums[n] = 0;
            zeros--;
            n--;
        }
    }
}