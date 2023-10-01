class Solution {
    public boolean isPowerOfFour(int n) {
        if(n < 1){
            return false;
        }
        if(n == 1){
            return true;
        }
        return isPowerOfFour(n/4) && n%4 == 0;
    }   
}