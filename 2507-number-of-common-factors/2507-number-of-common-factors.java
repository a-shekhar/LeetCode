class Solution {
    public int commonFactors(int a, int b) {
        int n = gcd(a, b);
        int count = 1; // 1 always divides
        for(int i = 2; i <= n; i++){
            if(a % i == 0 && b % i == 0){
                count++;
            }
        }

        return count; 
    }

    public int gcd(int a, int b) {
        if(b == 0){
            return a;
        }
        return gcd(b, a % b);
    }
}