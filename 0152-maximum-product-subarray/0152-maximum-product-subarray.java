class Solution {
    public int maxProduct(int[] nums) {
        int leftProduct = 1;
        int rightProduct = 1;
        int maxProduct = Integer.MIN_VALUE;
        int n = nums.length;
        
        for(int i = 0; i < n; i++){
            // to reset the product if it becomes 0
            leftProduct = (leftProduct == 0 ? 1 : leftProduct);
            rightProduct = (rightProduct == 0 ? 1 : rightProduct);
            
            leftProduct *= nums[i];
            rightProduct *= nums[n-1-i];

            maxProduct = Math.max(maxProduct, Math.max(leftProduct, rightProduct));
        }

        return maxProduct;
    }
}