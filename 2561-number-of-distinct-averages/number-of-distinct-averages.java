class Solution {
    public int distinctAverages(int[] nums) {
        Arrays.sort(nums);
        Set<Double> set = new HashSet<>();
        for(int i=0; i < nums.length/2; i++){
            set.add((nums[i] + nums[nums.length-1-i])/2.0);
        }
       
        return set.size();
    }
}