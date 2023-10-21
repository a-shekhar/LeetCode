class Solution {
    public int specialArray(int[] nums) {
        int[] frequency = new int[1001];
        for (int num : nums) {
            for (int k = 0; k <= num; k++) {
                frequency[k]++;
            }
        }
        for(int i= 0; i < frequency.length; i++){
            if(i == frequency[i]){
                return i;
            }
        }
        return -1;
    }
}