class Solution {
    public int mostFrequentEven(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        int val = 0;
        for(int num: nums){
            if(num % 2== 0) {
                map.putIfAbsent(num, 0);
                int temp = map.get(num) + 1;
                val = Math.max(temp, val);
                map.put(num, temp);
                list.add(num);
            }
        }
        
        Collections.sort(list);

        for(int key : list){
            if(map.get(key) == val){
                return key;
            }
        }
        return -1;  
    }
}