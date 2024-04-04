class Solution {
    public boolean isPossibleToSplit(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int num : nums){
            map.putIfAbsent(num , 0);
            map.put(num , map.get(num) + 1);
            if(map.get(num) > 2){
                return false;
            }
        } 
        return true;
    }
}