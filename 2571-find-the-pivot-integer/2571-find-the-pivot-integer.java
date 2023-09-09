class Solution {
    public int pivotInteger(int n) {
        int low = 0;
        int high = n;
        int sum = (n * (n + 1)) / 2;
        int leftSum = 0;
        int rightSum = 0;
        int mid = 0;
        while(low <= high){
            mid = (low + high)/2;
            leftSum = (mid * (mid + 1)) / 2;
            rightSum = (sum - leftSum) + mid;
            if(leftSum == rightSum){
                return mid;
            }else if(leftSum > rightSum){
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }
        return -1;
    }
}