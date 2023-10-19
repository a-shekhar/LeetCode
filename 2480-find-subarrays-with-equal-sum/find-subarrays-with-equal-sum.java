class Solution {
    public boolean findSubarrays(int[] nums) {
        List<Integer> set = new ArrayList<>();
        int sum;
        for(int i=1; i<nums.length; i++){
            sum = nums[i] + nums[i-1];
            if(set.contains(sum)){
                return true;
            }
            set.add(sum);
        }
        return false;
    }

}