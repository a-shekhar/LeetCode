class Solution {
    public double myPow(double x, int N) {
        double result = 1;
        long n = N;
        if(n < 0){
            x = 1 / x;
            n = -1 * n;
        }
        while(n > 0){
            if(n % 2 == 1){
                result *= x;
                n--;
            } else {
                x = x * x;
                n /= 2;
            }
        }

        return result;
    }
}