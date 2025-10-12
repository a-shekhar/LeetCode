class Solution {
    public int alternatingSum(int[] nums) {
        boolean isAdd = true;
        int sum = 0;
        for(int num : nums){
            sum = isAdd ? sum + num : sum - num;
            isAdd = !isAdd;
        }
        return sum;
    }
}