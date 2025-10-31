class Solution {
    public static void reverseArray(int[] nums, int startIndex, int endIndex){
        while(startIndex < endIndex){
            int temp = nums[endIndex];
            nums[endIndex] = nums[startIndex];
            nums[startIndex] = temp;
            startIndex++;
            endIndex--;
        }
    }

    public static  void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        reverseArray(nums, 0, nums.length-1);
        reverseArray(nums, 0, k-1);
        reverseArray(nums, k, nums.length-1);
    }
}