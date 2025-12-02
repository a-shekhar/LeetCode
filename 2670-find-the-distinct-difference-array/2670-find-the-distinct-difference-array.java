class Solution {
    public int[] distinctDifferenceArray(int[] nums) {
        Set<Integer> prefixSet = new HashSet<>();
        List<Integer> suffixList = new ArrayList<>();
        for(int num : nums){
            suffixList.add(num);
        }

        for(int i = 0; i < nums.length; i++){
            prefixSet.add(nums[i]);
            suffixList.remove(Integer.valueOf(nums[i]));
            nums[i] = prefixSet.size() - new HashSet<>(suffixList).size();
        }

        return nums;
    }
}