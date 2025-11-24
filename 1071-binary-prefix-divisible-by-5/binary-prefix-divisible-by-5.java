class Solution {
    public List<Boolean> prefixesDivBy5(int[] nums) {
        List<Boolean> list = new ArrayList<>();
        int val = 0;
        for(int num : nums){
            val = ((val << 1) + num) % 5;
            list.add(val == 0);
        }
        return list;
    }
}