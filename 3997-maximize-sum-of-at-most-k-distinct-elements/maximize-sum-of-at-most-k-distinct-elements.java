class Solution {
    public int[] maxKDistinct(int[] nums, int k) {
       Arrays.sort(nums);  // ascending

        Set<Integer> set = new HashSet<>();
        List<Integer> list = new ArrayList<>();
        for(int i = nums.length - 1; i >= 0; i--){
            if(!set.contains(nums[i])){
               list.add(nums[i]);
            }
            set.add(nums[i]);
            if(list.size() >= k) break;
        }

        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}