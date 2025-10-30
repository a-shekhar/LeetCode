class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> set = new HashSet<>();
        Arrays.sort(nums);

        for(int i = 0; i < nums.length - 2; i++){
           // skip duplicate values
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            // no need to check if only first element is greater than 0
            if(nums[i] > 0) break;

            int num1 = nums[i];

            int left = i + 1;
            int right = nums.length - 1;
            while(left < right){
                int num2 = nums[left];
                int num3 = nums[right];
                int sum = num1 + num2 + num3;

                if(sum == 0){
                    set.add(Arrays.asList(num1, num2, num3));             left++;
                    right--;
                } else if(sum > 0){
                    right--;
                } else {
                    left++;
                }
            }
        }

        return new ArrayList<>(set);
    }
}