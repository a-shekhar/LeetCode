class Solution {
    public int minOperations(List<Integer> nums, int k) {
        int maxSum = (k * (k+1))/2;
        int sum = 0;
        List<Integer> list = new ArrayList<>();
        int count = 0;
        for(int j = nums.size()-1; j >= 0; j--){
            if(!list.contains(nums.get(j))){
                if(nums.get(j) <= k){
                   sum += nums.get(j);
                }
                list.add(nums.get(j));
            }
            count++;
            if(sum == maxSum){
                return count;
            }
        }
        return count;
    }
}