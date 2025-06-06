class Solution {
    public int[] sortedSquares(int[] nums) {
        for(int i = 0; i < nums.length; i++){
            nums[i] = nums[i] * nums[i];
        }

        int head = 0;
        int tail = nums.length - 1;
        int result[] = new int[nums.length];
        for(int pos = tail; pos >= 0; pos--){
            if(nums[tail] > nums[head]){
                result[pos] = nums[tail];
                tail--;
            }else{
                result[pos] = nums[head];
                head++;
            }
        }
        return result;
    }
}