class Solution {
    public int mySqrt(int x) {
        long low = 0;
        long high = x;
        long mid;
        long n = x;
        long res;
        while(low <= high){
            mid = low + ((high - low) / 2);
            res = mid * mid;
            if(res == n){
                return (int) mid;
            } else if(res > n){
                high = mid - 1;
            } else if(res < n){
                low = mid + 1;
            }
        }

        return (int) high;
    }
}