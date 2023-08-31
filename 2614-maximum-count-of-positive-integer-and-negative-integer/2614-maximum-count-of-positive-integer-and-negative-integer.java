class Solution {
    public int maximumCount(int[] nums) {
        int neg = 0;
        int zero = 0;
        for(int num : nums){
            if(num < 0) {
                neg++;
            }else if(num == 0) { 
                zero++;
            }else{
                break;
            }
        }
        return Math.max(neg, nums.length-zero-neg);
    }
}