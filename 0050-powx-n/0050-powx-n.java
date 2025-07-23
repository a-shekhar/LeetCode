class Solution {
    public double myPow(double x, int n) {
        
        long N  = n; // to avoid overflow of Integer.MIN_VALUE

        if(N < 0){
            x = (1/x);
            N = -1 * N;
        }

        double result = 1;
        double currProduct = x;

        while(N > 0){
            if(N % 2 == 1){
                result = result * currProduct;
            }

            currProduct = currProduct * currProduct;
            N = N/2;
        }

        return result;
    }
}