class Solution {
    public int[] plusOne(int[] digits) {
        for(int i = digits.length-1; i >= 0; i--){
            if(digits[i] < 9){
                digits[i]++; // just increment by 1
                return digits;
            }
            digits[i] = 0;
        }

        // if we reach here means all were 9 and converted to 0
        int[] nums = new int[digits.length + 1];
        nums[0] = 1; // increment by 1
        return nums;
    }
}