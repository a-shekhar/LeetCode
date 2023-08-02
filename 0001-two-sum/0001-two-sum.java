class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int num = 0;
        for(int i=0; i < nums.length; i++){
            num = target - nums[i];
            if(map.containsKey(num)){
                return new int[]{map.get(num), i};
            }else{
                map.put(nums[i], i);
            }
        }
        return new int[2];
    }
}