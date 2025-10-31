class Solution {
    public static  int[] getSneakyNumbers(int[] nums) {
        int n = nums.length-2;
        int xor = 0;
        for(int i = 0; i < n; i++){
            xor ^= i;
        }

        for(int i = 0; i < nums.length; i++){
            xor ^= nums[i];
        }

        int bitDiff = xor & -xor;
        System.out.println(bitDiff);

        int xor1 = 0;
        int xor2 = 0;
        
        for(int i = 0; i < nums.length; i++){
            int num =  bitDiff & nums[i];
            if(num != 0){
                xor1 ^= nums[i];
            }else{
                xor2 ^= nums[i];
            }
        }

        for(int i = 0; i < n; i++){
            int num =  bitDiff & i;
            if(num != 0){
                xor1 ^= i;
            }else{
                xor2 ^= i;
            }
        }

        return new int[]{xor1, xor2};
    }
}