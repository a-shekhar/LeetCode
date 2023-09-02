class Solution {
    public int maximizeSum(int[] nums, int k) {
        Arrays.sort(nums);
        // looks like AP with comman diffrence 1 :)
       int a = nums[nums.length-1];
       int last = a + (k-1);
       return (int) ((((double)a + last)/2) * k);
    }
}