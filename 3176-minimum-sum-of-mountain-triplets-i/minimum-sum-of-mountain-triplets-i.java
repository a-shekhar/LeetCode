class Solution {
    public int minimumSum(int[] nums) {
        int triplet = Integer.MAX_VALUE;
        for(int i=0; i < nums.length-2; i++){
            for(int j= i+1; j < nums.length-1; j++){
                for(int k=j+1; k< nums.length; k++){
                    if(nums[i] < nums[j] && nums[k] < nums[j]){
                        triplet = Math.min(triplet, nums[i] + nums[j] + nums[k]);
                    }
                }
            }
        }
        return triplet == Integer.MAX_VALUE ? -1 : triplet;
    }
}