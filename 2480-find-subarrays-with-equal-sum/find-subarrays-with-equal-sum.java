class Solution {
    public boolean findSubarrays(int[] nums) {
        int i = 0;
        int j = nums.length-1;
        List<Integer> list = new ArrayList<>();
        int sum;
        while(i < j-1){
            sum = nums[i] + nums[i+1];
            list.add(sum);
            if(list.contains(nums[j] + nums[j-1])){
                return true;
            }
            i++;
            j--;
        }
        return false;
    }

}