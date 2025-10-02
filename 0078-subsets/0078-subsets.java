class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> tempList = new ArrayList<>();
        //Map<I map = new ArrayList<>();
        findSubsets(0, nums, tempList, result);
        return result;
    }

    private void findSubsets(int curr, int[] nums, List<Integer> tempList, List<List<Integer>> result){
        if(curr == nums.length){
            result.add(new ArrayList<>(tempList)); // add a copy
            return;
        }

        // include the curr element
        tempList.add(nums[curr]);

        // keep adding 
        findSubsets(curr + 1, nums, tempList, result);

        // remove the last element
        tempList.remove(tempList.size()-1);

        // find remaining possiblities
        findSubsets(curr + 1, nums, tempList, result);
    }
}