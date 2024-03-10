class Solution {
    public int minOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int count = 0;
        for(int num : nums){
            if(num >= k){
                return count;
            }else{
                count++;
            }
        }
        return count;
    }
}