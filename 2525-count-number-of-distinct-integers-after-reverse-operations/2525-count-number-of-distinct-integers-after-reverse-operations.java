class Solution {
    public int countDistinctIntegers(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int temp = 0;
        for(int num:nums){
            temp = reverseInt(num);
            set.add(num);
            set.add(temp);
        }
        return set.size();
    }

    private int reverseInt(int num){
        int reverse = 0;
        while(num > 0){
            reverse = (reverse * 10) + (num % 10);
            num /= 10;
        }
        return reverse; 
    }
}