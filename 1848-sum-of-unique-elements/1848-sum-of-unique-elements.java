class Solution {
    public int sumOfUnique(int[] nums) {
        Map<Integer, Integer>map = new HashMap<>();
        
        for(int num : nums){
            map.putIfAbsent(num, 0);
            map.put(num, map.get(num) + 1);
        }
        int sum =0;
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(entry.getValue() == 1){
                sum += entry.getKey();
            }
        }
        return sum ;
    }
}