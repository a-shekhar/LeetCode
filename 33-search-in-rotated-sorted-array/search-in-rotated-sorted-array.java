class Solution {
    public int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        int mid;
        while(low <= high){
            mid  = low + (high - low) / 2;
            if(nums[mid] == target){
                return mid;
            }

            // if it is left sorted 
            if(nums[low] <= nums[mid]){
                // so it it is in left or right 
                if(nums[low] <= target && target < nums[mid]){
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } else { // right sorted 
                 // so it it is in left or right 
                 if(nums[mid] < target && target <= nums[high]){
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }

        return -1;
    }
}