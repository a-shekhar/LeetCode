class Solution {
    public int evenNumberBitwiseORs(int[] nums) {
        int sum = 0;
        for(int num : nums){
            if(num % 2 == 0){
                sum |= num;
            }
        }

        return sum;
    }
}