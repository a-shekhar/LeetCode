class Solution {
    public boolean canBeIncreasing(int[] nums) {
        int skipIndex = 0;
        int len = nums.length;
        int[] cloned = new int[len-1];
        boolean canBeIncreasing = true;
        while(skipIndex < nums.length){
            int j = 0;
            canBeIncreasing = true;
            for(int i = 0; i < len; i++){
                if(skipIndex == i) continue;
                cloned[j++] = nums[i];
            }

            for(int i = 1; i < cloned.length; i++){
                if(cloned[i-1] >= cloned[i]) {
                    canBeIncreasing = false;
                    break;
                }
            }

            if(canBeIncreasing) return true;
            skipIndex++;
        }
        return false;
    }
}