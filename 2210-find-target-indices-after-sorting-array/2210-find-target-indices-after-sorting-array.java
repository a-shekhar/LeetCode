class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums);
        List<Integer>list = new ArrayList<>();
        int i = 0;
        for(int num:nums){
            if(num == target){
                list.add(i);
            }
            i++;
        }
        return list;
    }
}