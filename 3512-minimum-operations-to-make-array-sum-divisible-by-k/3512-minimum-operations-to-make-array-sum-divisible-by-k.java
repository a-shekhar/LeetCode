class Solution {
    public int minOperations(int[] nums, int k) {
        int sum = Arrays.stream(nums).parallel().sum();
        return sum % k;
    }
}