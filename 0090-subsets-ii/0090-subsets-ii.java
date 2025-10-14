class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> tempList = new ArrayList<>();
        Arrays.sort(nums);
        findSubset(0, nums, tempList, result);
        return result;
    }

    private void findSubset(int index, int[] nums, List<Integer> tempList, List<List<Integer>> result) {
        if(index == nums.length){
            result.add(new ArrayList<>(tempList));
            return;
        }


        tempList.add(nums[index]);
        findSubset(index + 1, nums, tempList, result);
        tempList.remove(tempList.size()-1);
        int next = index + 1;
        while (next < nums.length && nums[next] == nums[index]) {
            next++; // skip all duplicates
        }
        findSubset(next, nums, tempList, result);
    }
}