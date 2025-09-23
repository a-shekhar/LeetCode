class Solution {
    public int minElement(int[] nums) {
        int minElement = Integer.MAX_VALUE;
        int sum = 0;
        for(int num : nums){
            sum = 0;
            while(num > 0){
                sum += (num % 10);
                num /= 10;
            }
            minElement = Math.min(minElement, sum);
        }
        return minElement;
    }
}