class Solution {
    public int maximizeExpressionOfThree(int[] nums) {
        int firstMax = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        int minVal = Integer.MAX_VALUE;

        for(int num : nums){
            if(num >= firstMax){
                secondMax = firstMax;
                firstMax = num;
            } else if (num > secondMax){
                secondMax = num;
            }
            minVal = Math.min(num, minVal);
        }

        return firstMax + secondMax - minVal;
    }
}