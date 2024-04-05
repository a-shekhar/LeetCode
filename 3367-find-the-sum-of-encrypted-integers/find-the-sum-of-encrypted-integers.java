class Solution {
    public int sumOfEncryptedInt(int[] nums) {
        int maxInt;
        int digits;
        int sum = 0;
        String numInStr;
        for(int num : nums){
            maxInt = 0;
            digits = 0;
            while(num >  0){
                maxInt = Math.max(maxInt, num % 10);
                digits++;
                num /= 10;
            }
            numInStr = String.valueOf(maxInt).repeat(digits);
            sum += Integer.valueOf(numInStr);
        }
        return sum;
    }
}