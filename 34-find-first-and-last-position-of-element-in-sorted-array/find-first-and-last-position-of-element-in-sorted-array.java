class Solution {
     public int[] searchRange(int[] nums, int target) {
        int first = findFirstPosition(nums, target);
        int last = findLastPosition(nums, target);
        return new int[]{first, last};
    }

    private int findFirstPosition(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        int pos = -1;
        while(low <= high){
            int mid = low + (high - low)/2;
            if(nums[mid] == target){
                pos = mid; // potential but keep finding
                high = mid - 1;
            }else if(nums[mid] > target){
                high = mid -1;
            } else{
                low = mid + 1;
            }
        }
        return pos;
    }

    private int findLastPosition(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        int pos = -1;
        while(low <= high){
            int mid = low + (high - low)/2;
            if(nums[mid] == target){
                pos = mid; // potential but keep finding
                low = mid + 1;
            }else if(nums[mid] > target){
                high = mid -1;
            } else{
                low = mid + 1;
            }
        }
        return pos;
    }
}