class Solution {
    public int countElements(int[] nums) {
        if(nums.length < 3){
            return 0;
        }
        Arrays.sort(nums);
        int min = nums[0];
        int n = nums.length;
        for(int i = 1; i < nums.length; i++){
           if(nums[i] != min){
               break;
           }
           n--;
        }

        int max = nums[nums.length-1];

        for(int j = nums.length-2; j >= 0; j--){
           if(nums[j] != max){
               break;
           }
           n--;
        }
        return n-2 < 0 ? 0 : n-2;
    }
}