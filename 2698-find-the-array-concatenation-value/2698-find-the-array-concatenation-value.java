class Solution {
     public long findTheArrayConcVal(int[] nums) {
        long sum = 0;
        int i = 0;
        int j = nums.length-1;
        while(i < j){
            sum += Integer.parseInt(String.valueOf(nums[i]) + nums[j]);
            i++;
            j--;
        }
        
        if(nums.length % 2 == 1){
            sum += nums[nums.length/2];
        }
        return sum;
    }
}