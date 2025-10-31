class Solution {
    public int reverse(int x) {
         if(x == 0) return 0;
        long num = 0;
        boolean isNeg = false;
        if(x < 0) {
            x = -x;
            isNeg = true;
        }
        while(x > 0){
            int rem = x % 10;
            num = (num * 10) + rem;
            if(num < Integer.MIN_VALUE) return 0;
            if(num > Integer.MAX_VALUE) return 0;
            x /= 10;
        }
        return isNeg ? -1 * (int) num : (int) num;
    }
}