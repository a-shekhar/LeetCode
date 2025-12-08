class Solution {
    public int maxProduct(int n) {
        String s = String.valueOf(n);
        int maxProduct = Integer.MIN_VALUE;
        for(int i = 0; i < s.length() - 1; i++){
            for(int j = i + 1; j < s.length(); j++){
                int product = (int) (s.charAt(i) - '0') * (int) (s.charAt(j) - '0');
                maxProduct = Math.max(maxProduct, product);
            }
        }
        return maxProduct;
    }
}