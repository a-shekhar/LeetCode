class Solution {
     public int minMaxGame(int[] nums) {
        int n = nums.length;
        int[] arr = new int[n];
        while (n != 1){
            n /= 2;
            arr = new int[n];
            for(int i=0; i < n; i++) {
                if(i % 2 == 0){
                    arr[i] = Math.min(nums[2 * i], nums[2 * i + 1]);
                }else{
                    arr[i] = Math.max(nums[2 * i], nums[2 * i + 1]);
                }
            }
          
            nums = arr;
        }
        return nums[0];
    }
}