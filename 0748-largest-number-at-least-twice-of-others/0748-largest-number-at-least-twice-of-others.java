class Solution {
    public int dominantIndex(int[] nums) {
        int[] temp = Arrays.copyOf(nums, nums.length);
        Arrays.sort(temp);
        if(temp[temp.length-1] >= 2 * temp[temp.length-2]){
            for(int i =0 ; i < nums.length; i++){
                if(nums[i] == temp[temp.length-1]){
                    return i;
                }
            }
        }
        return -1;
    }
}