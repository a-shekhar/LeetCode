class Solution {
    public int maxProduct(int[] nums) {
         return IntStream.range(0, nums.length).boxed()
                .sorted((i, j) -> nums[j] - nums[i]).limit(2).reduce((i, j) -> ((nums[i] - 1) * (nums[j] -1))).get();
    }
}