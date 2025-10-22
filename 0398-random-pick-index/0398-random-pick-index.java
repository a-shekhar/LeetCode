class Solution {

    Map<Integer, List<Integer>> map = new HashMap<>();
    public Solution(int[] nums) {
        for(int i = 0; i < nums.length; i++){
            map.putIfAbsent(nums[i], new ArrayList<>());
            map.get(nums[i]).add(i);
        }
    }
    
    public int pick(int target) {
        int n = map.get(target).size() - 1;
        int randomInt = (int)(Math.random() * (n - 0 + 1)) + 0;

        return map.get(target).get(randomInt);
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int param_1 = obj.pick(target);
 */