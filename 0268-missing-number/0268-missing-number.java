class Solution {
    public int missingNumber(int[] nums) {
        int missingNum = 0;
        for(int i = 0; i <= nums.length; i++){
            missingNum ^= i;
        }

        for(int num : nums){
            missingNum ^= num;  
        }

        return missingNum;
    }
}