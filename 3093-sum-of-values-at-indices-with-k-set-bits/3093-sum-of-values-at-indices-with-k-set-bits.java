class Solution {
    public int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        int sum = 0;
        for(int i = 0; i< nums.size(); i++){
            if(countOnes(i) == k){
               sum += nums.get(i);
            }
        }
        return sum;
    }

    private int countOnes(int num){
        int ones = 0;
        while(num > 0){
            if(num % 2 == 1){
                ones++;
            }
            num /= 2;
        }
        return ones;
    }
}