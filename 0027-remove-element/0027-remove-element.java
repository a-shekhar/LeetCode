class Solution {
    public int removeElement(int[] nums, int val) {
        if(nums.length == 1){
            if(nums[0] == val){
                return 0;
            }
            return 1;
        }
        int i = 0;
        int j = nums.length-1;
        int temp;
        int k = 0;
        while(i <= j){
           
            if(nums[i] == val){
                while(nums[j] == val){
                    j--;
                    if(i > j){
                        return k;
                    }
                }
                temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
            i++;
            k++;
        }
        return k;
    }
}