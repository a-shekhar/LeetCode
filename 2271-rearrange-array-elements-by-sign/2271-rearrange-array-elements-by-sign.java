class Solution {
    public int[] rearrangeArray(int[] nums) {
        int i = 0;
        int j = 1;
        int[] ans = new int[nums.length];
        for(int num : nums){
            if(num > 0){
                ans[i] = num;
                i += 2;
            }else{
                ans[j] = num;
                j += 2;
            }
        }
        return ans;
    }
}