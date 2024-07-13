class Solution {
     public int duplicateNumbersXOR(int[] nums) {
        int[] arr = new int[51];
        int xor = 0;
        for(int num : nums){
            if(++arr[num] % 2 == 0){
                xor = xor ^ num;
            }
        }
        return xor;
    }
}