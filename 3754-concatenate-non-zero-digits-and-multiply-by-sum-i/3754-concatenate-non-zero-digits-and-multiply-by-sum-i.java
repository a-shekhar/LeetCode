class Solution {
    public long sumAndMultiply(int n) {
        long rev = 0;
        int multi = 1;
        long sum = 0;
        while(n > 0){
            int rem = n % 10;
            if(rem != 0){
                rev += rem * multi;
                multi *= 10;
            }
            n /= 10;
            sum += rem;
        }
        return rev * sum;
    }
}