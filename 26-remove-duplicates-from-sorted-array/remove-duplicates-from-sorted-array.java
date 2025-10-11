class Solution {
    public int removeDuplicates(int[] nums) {
         if(nums.length == 1){
            return 1;
        }
        int i = 0;
        for (int j = 0; j < nums.length; j++){
            if(nums[j] != nums[i]){
                nums[++i] = nums[j];
            }
        }
        //System.out.println(i + " " + Arrays.toString(nums));
        return i + 1;
    }
}