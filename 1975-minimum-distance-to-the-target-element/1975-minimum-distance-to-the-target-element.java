class Solution {
    public int getMinDistance(int[] nums, int target, int start) {
        if(nums[start] == target){
            return 0;
        }
        int steps = Integer.MAX_VALUE;
        for(int i = start+1; i < nums.length; i++){
            if(nums[i] == target){
                steps = i - start;
                break; 
            }
        }

        for(int j = start-1; j >= 0; j--){
            if(nums[j] == target){
                steps = Math.min(steps, start-j);
                break; 
            }
        }
        return steps;
    }
}