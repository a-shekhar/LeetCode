class Solution {
    public int mostFrequent(int[] nums, int key) {
        int frequent = 0;
        int ans = 0;
        int temp;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 1; i < nums.length; i++){
            if(nums[i-1] == key){
                temp = map.getOrDefault(nums[i], 0) + 1;
                if(temp > frequent){
                    frequent = temp;
                    ans = nums[i];
                }
                map.put(nums[i], temp);
            }
        }
        return ans;
    }
}