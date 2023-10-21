class Solution {
    public long maximumTripletValue(int[] nums) {
        long triplet = Integer.MIN_VALUE;
        for(int i=0; i < nums.length-2; i++){
            for(int j=i+1; j < nums.length-1; j++){
                for(int k=j+1; k < nums.length; k++){
                    triplet = Math.max(triplet, (long) (nums[i] - nums[j]) * nums[k]);
                }
            }
        }
        return triplet < 0 ? 0 : triplet;
    }
}