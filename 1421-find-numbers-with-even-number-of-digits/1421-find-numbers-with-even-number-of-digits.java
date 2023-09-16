class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        int temp = 0;
        for(int num : nums){
            temp = 0;
            while(num > 0){
                temp++;
                num /= 10;
            }
            if(temp % 2 == 0){
                count++;
            }
        }
        return count;
    }
}