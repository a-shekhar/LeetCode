class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int i = 0;
        for(int num : nums){
            if(map.containsKey(target - num)){
                return new int[] {i, map.get(target-num)}; 
            } else{
                map.put(num, i);
            }
            i++;
        }
        return new int[]{-1, -1};
    }
}