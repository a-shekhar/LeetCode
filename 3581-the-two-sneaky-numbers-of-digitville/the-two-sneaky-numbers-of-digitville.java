class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int[] temp = new int[nums.length-2];
        int[] res = new int[2];
        int index = 0;
        for(int num : nums){
            temp[num]++;
            if(temp[num] == 2){
                res[index++] = num;
            }
        }
        return res;
    }
}