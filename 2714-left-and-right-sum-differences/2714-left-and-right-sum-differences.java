class Solution {
    public int[] leftRightDifference(int[] nums) {
        int leftSum = 0;
        int rightSum = 0;
        int[] answer = new int[nums.length];
        for(int num: nums){
            rightSum += num;
        }

        for(int i= 0; i < nums.length; i++){
            leftSum += nums[i];
            answer[i] = Math.abs(leftSum-rightSum);     
            rightSum -= nums[i] ;   
        }
        return answer;
    }
}