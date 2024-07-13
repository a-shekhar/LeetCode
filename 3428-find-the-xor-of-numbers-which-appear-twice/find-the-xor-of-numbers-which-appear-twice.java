class Solution {
    public int duplicateNumbersXOR(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int xor = 0;
        for(int num : nums){
            if(!list.contains(num)){
                list.add(num);
            }else{
                xor ^= num;
            }
        }
        return xor;
    }
}