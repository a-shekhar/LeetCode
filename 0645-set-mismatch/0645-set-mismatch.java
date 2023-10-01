class Solution {
    public int[] findErrorNums(int[] nums) {
      int totalSum = (nums.length * (nums.length + 1)) / 2;
      Arrays.sort(nums);
      int missing=0;
      int duplicate=0;
      int sum = 0;

      for(int i=0; i <nums.length; i++){
        if(i != nums.length-1 && (nums[i]^nums[i+1]) == 0){
          duplicate = nums[i];
        }else{
          sum += nums[i];
        }
      }
      return new int[] {duplicate, totalSum-sum};
    }
}