class Solution {
    public int removeElement(int[] nums, int val) {
        int i = 0;
        int j = nums.length - 1;
        int count = 0;
        while(i <= j){
            if(nums[i] == val){
                if(nums[j] == val){
                    j--;
                } else {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                    i++;
                    j--; 
                }
            }else {
                i++;
            }
        }

        i = 0;
        while(i < nums.length && nums[i] != val){
            count++;
            i++;
        }
        return count;
    }
}