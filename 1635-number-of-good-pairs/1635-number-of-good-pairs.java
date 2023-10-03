class Solution {
    public int numIdenticalPairs(int[] nums) {
        int[] count = new int[101];
        int pairs = 0;
        for(int num : nums){
            pairs += count[num];
            count[num]++;
        }
     
        return pairs;
    }
}