class Solution {
     public int findClosestNumber(int[] nums) {
        int min = Integer.MAX_VALUE;
        int val = 0;
        for(int num : nums){
            if(min > Math.abs(num)){
                min = Math.abs(num);
                val = num;
            }else if(min == Math.abs(num)){
                val = Math.max(val, num);
            }
        }
        return val;
    }
}