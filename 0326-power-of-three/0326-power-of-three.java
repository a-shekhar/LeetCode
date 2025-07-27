class Solution {
    public boolean isPowerOfThree(int n) {
        if(n < 1){
            return false;
        }

        if(n == 1){
            return true;
        }

        return isPowerOfThree(n/3) &&  (n % 3 == 0);
    }
}