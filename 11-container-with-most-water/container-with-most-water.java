class Solution {
    public int maxArea(int[] height) {
         int maxArea = Integer.MIN_VALUE;

        int low = 0;
        int high = height.length - 1;

        while(low <= high){
            int num1 = height[low];
            int num2 = height[high];
            int area = (high - low) * Math.min(num1, num2);
            maxArea = Math.max(maxArea, area);
            if(num1 <= num2){
                low++;
            } else {
                high --;
            }
        }

        return maxArea;
    }
}