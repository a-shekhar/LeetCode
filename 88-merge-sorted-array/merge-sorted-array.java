class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
       
        int j = n - 1;
        int i = m - 1;
        int end = m + n - 1;
        while(j >= 0 && i >= 0){
            if(nums2[j] >= nums1[i]){
                nums1[end] = nums2[j];
                j--;
                end--;
            } else {
                nums1[end] = nums1[i];
                i--;
                end--;
            }
        }

        // copy remaining nums2 elements (if any)
        while (j >= 0) {
            nums1[end--] = nums2[j--];
        }
    }
}