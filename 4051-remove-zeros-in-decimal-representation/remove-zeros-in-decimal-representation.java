class Solution {
    public long removeZeros(long n) {
        long num = 0;
        int multiplier = 0;
        while(n > 0){
            long rem = n % 10;
            if(rem!= 0){
                num += rem * Math.pow(10, multiplier);
                multiplier++;
            }
            n /= 10;
        }
        return num;
    }
}