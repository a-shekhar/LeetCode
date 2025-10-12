class Solution {
    public int addedInteger(int[] nums1, int[] nums2) {
        int sum = 0;
        for(int num : nums2){
            sum += num;
        }

        for(int num : nums1){
            sum -= num;
        }

        return sum/nums1.length;
    }
}