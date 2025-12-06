class Solution {

     int subsetXORSum = 0; 

    public int subsetXORSum(int[] nums) {
        solve(0, nums, 0);
        return subsetXORSum;
    }

    public void solve(int index, int[] nums, Integer sum){
        if(index >= nums.length){
            subsetXORSum += sum;
            return;
        }
        // include current index
            solve(index + 1, nums, sum ^ nums[index]);
        // exclude current index
        solve(index + 1, nums, sum);
    }
}