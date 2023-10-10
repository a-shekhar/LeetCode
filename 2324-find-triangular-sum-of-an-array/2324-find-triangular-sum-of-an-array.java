class Solution {
    public int triangularSum(int[] nums) {
        int[] temp;
        int j;
        while (nums.length > 1){
            temp = new int[nums.length-1];
            j = 0;
            for(int i=1; i < nums.length; i++){
                temp[j] = (nums[i] + nums[i-1]) % 10;
                j++;
            }
            nums = Arrays.copyOf(temp, temp.length);
        }
        return nums[0];
    }
}