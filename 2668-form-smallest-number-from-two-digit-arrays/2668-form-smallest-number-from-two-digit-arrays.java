class Solution {
    public int minNumber(int[] nums1, int[] nums2) {
        int min1 = 10;
        int min2 = 10;
        int same = 10;
        for(int num1 : nums1){
            for(int num2 : nums2){
                if(num1 == num2){
                   same = Math.min(same, num1);
                }
            min2 = Math.min(min2, num2);
            }
            min1 = Math.min(min1, num1);
        }
        if(same < 10){
            return same;
        }
        return min1 > min2 ? (min2 * 10) + min1 : (min1 * 10) + min2; 
    }
}