class Solution {
     public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        findPermutation(0, nums, result);
        return result;
    }

    private void findPermutation(int index, int[] nums, List<List<Integer>> result) {
        if(index == nums.length){
            ArrayList<Integer> res = new ArrayList<>();
            for(int num : nums){
                res.add(num);
            }
            result.add(new ArrayList<>(res));
        }

        
        for(int i = index; i < nums.length; i++){
            swap(nums, index, i);
            findPermutation(index+1, nums, result);
            swap(nums, index, i);
        }
    }

    private void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}