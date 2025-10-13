class Solution {
    public int findPeakElement(int[] nums) {
        if(nums.length == 1){
            return 0;
        }

        int low = 0;
        int n = nums.length;
        int high = n - 1;

        while(low <= high){
            int  mid = low + (high - low) / 2;

            if(mid == 0 && nums[0] > nums[1]){
                return 0;
            }

            if(mid == n - 1 && nums[n-1] > nums[n-2]){
                return n-1;
            }

            if(nums[mid] > nums[mid+1] && nums[mid] > nums[mid-1]){
                return mid;
            }

            if(nums[mid] <= nums[mid+1]){
                low = mid + 1;
            } else if(nums[mid] <= nums[mid-1]){
                high = mid -1;
            }
        }
        return -1;
    }
}