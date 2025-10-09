class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();
        int j = 0;
        while(j < nums.length){
            if(set.contains(nums[j])){
                return true;
            }

            set.add(nums[j]);
            if(set.size() > k){
                set.remove(nums[j-k]);
            }
            j++;
        }
        return false;
    }
}