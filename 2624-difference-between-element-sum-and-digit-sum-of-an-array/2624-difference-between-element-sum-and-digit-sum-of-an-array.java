class Solution {
    public int differenceOfSum(int[] nums) {
        int sum = 0;
        int digitSum = 0;
        for(int num: nums){
            sum += num;
            while(num > 0){
                digitSum += num % 10;
                num /= 10;
            }
        }
        return Math.abs(sum - digitSum);
    }
}