class Solution {
    public boolean isPerfectSquare(int num) {
        int low = 1;
        int high = num;
        int mid;
        while(low <= high){
            mid = low + ((high - low) / 2);
            if(num % mid == 0 && mid == num/mid){
                return true;
            }else if((long) mid * mid > num){
                high = mid - 1;
            }else {
                low = mid + 1;
            }
        }
        return false;
    }
}