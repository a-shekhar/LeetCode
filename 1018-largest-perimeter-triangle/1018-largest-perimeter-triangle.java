class Solution {
    public int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        int first, second, third;
        for(int j = nums.length-1; j >=2; j--){
            first = nums[j];
            second = nums[j-1];
            third = nums[j-2];
            if(first + second > third && second + third > first && first + third > second){
                return first + second + third;
            }
        }
        return 0;
    }
}