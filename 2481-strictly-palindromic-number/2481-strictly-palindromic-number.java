class Solution {
    public boolean isStrictlyPalindromic(int n) {
        for(int i=2; i<=n-2; i++){
            int temp = convert(n, i);
            if(n != temp){
                return false;
            }
        }
        return true;
    }

    public int convert(int n, int base){
        int num = n;
        int rem  = 0;
        int rev = 0;
        while(num > 0){
            rem = num % base;
            rev = (rev * 10) + rem;
            num /= 10;
        } 
        return num;
    }
}