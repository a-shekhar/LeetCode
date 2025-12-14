class Solution {
    public int absDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int largest = 0;
        int smallest = 0;
        int n = nums.length;
        for(int i = 0; i < k; i++){
            smallest += nums[i];
            largest += nums[n-1-i];
        }
        return Math.abs(largest - smallest);
    }
}