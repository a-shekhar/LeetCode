class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int[] ans = new int[nums.length];
        int i = 0;
        int j = nums.length-1;
        int index = 0;
        while(index < nums.length){
            if(nums[index] % 2 == 0){
                ans[i] = nums[index];
                i++;
            }else{
                ans[j] = nums[index];
                j--;
            }
            index++;
        }
        return ans;
    }
}