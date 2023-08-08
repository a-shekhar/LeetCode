class Solution {
    public int findLucky(int[] arr) {
        Arrays.sort(arr);
        Map<Integer, Integer> map = new HashMap<>();
        for(int num: arr){
            map.put(num, map.getOrDefault(num, 0)+1);
        }
        int result = 0;
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getKey() == entry.getValue()){
                result = entry.getKey();
            }
        }
        return result == 0 ? -1: result;
    }
}