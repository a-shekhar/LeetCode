class Solution {
    public int majorityElement(int[] nums) {
        int candidate = -1;
        int count = 0;
        for(int num : nums){
            if(count == 0){
                candidate = num;
            }
            count = (num == candidate) ? count + 1 : count - 1;
        }
        return candidate;
    }
}