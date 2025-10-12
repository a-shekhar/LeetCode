class Solution {
    public boolean canAliceWin(int[] nums) {
        int sum = 0;
        for(int num : nums){
            if(num < 10){
                sum += num;
            } else {
                sum -= num;
            }
        }
        return sum != 0;
    }
}