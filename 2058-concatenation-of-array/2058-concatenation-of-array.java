class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] result = new int[2 * n];
        int i = 0;
        for(int num: nums){
            result[i] = num;
            result[i+n] = num;
            i++;
        }
        return result;
    }
}