class Solution {
    public boolean checkDivisibility(int n) {
        int sum = 0;
        int multiply = 1;
        int rem;
        int num = n;
        while(n > 0){
            rem = n % 10;
            sum += rem;
            multiply *= rem;
            n /= 10;
        }

        return  num % (sum + multiply) == 0;
    }
}