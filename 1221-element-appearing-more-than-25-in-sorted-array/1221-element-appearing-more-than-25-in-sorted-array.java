class Solution {
    public int findSpecialInteger(int[] arr) {
        int n = arr.length/4;
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;
        for(int num: arr){
           map.putIfAbsent(num, 0);
           count = map.get(num) + 1;
            map.put(num, count);
            if(count > n){
                return num;
            }
        }
        return -1;
    }
}