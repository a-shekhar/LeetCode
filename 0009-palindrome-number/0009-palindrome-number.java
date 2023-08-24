class Solution {
    public boolean isPalindrome(int x) {
        int reverse = 0;
        int rem = 0;
        int n = x;
        while(x > 0){
            rem = x % 10;
            reverse = (reverse * 10) + rem; 
            x /= 10;
        }
        return n == reverse;
    }
}