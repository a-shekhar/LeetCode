class Solution {
    public boolean divideArray(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int num: nums){
            map.putIfAbsent(num, 0);
            map.put(num, map.get(num) + 1);
        }
        
        List<Integer> list = new ArrayList<>(map.values());
    
        for(int val : list){
            if(val % 2 == 1){
                return false;
            }
        }
      
        return true;
    }
}