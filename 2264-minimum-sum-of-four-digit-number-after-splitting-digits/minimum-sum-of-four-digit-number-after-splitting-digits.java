class Solution {
    public int minimumSum(int num) {
        int i = 0;
        int[] digits = new int[4];
        
        while(num > 0){
            digits[i++] = num % 10;
            num /= 10;
        }

        Arrays.sort(digits);

        return ((digits[0] * 10) + digits[2]) + ((digits[1] * 10) + digits[3]);
    }
}