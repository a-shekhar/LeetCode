class Solution {
    public int[] numberOfPairs(int[] nums) {
         int pair = 0;
         Arrays.sort(nums);

         for(int i =0 ;  i < nums.length-1; i++){
             if(nums[i] == nums[i+1]){
                 nums[i+1] = -1;
                 pair++;
             }
         }
         return new int[]{pair, nums.length - (2 * pair)};
    }
}