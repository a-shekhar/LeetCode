class Solution {
    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        int num1 = nums[0];
        int num2 = nums[nums.length-1];
        int n = Math.min(num1, num2);
        for(int j = n; j >= 1; j--){
            if(num1 % j == 0 && num2 %  j == 0){
                n = j;
                break;
            }
        }
        return n;
    }
}