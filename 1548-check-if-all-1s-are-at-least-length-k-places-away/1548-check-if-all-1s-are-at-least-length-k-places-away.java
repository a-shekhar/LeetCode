class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        int i = 0;
        int prev = -1;
        while(i < nums.length){
            if(nums[i] == 1) {
                prev = i;
                i++;
                break;
            }
            i++;
        }


        while(i < nums.length){
            if(nums[i] == 1) {
                if(i - prev - 1 < k) return false;
                prev = i;
            }
            i++;
        }

        return true;
    }
}