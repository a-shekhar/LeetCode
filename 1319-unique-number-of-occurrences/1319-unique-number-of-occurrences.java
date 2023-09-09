class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        Set<Integer> set = new HashSet<>();
        for(int num: arr){
            map.putIfAbsent(num, 0);
            map.put(num, map.get(num) + 1);
        }

        for(Integer num : map.values()){
            if(set.contains(num)){
                return false;
            }else{
                set.add(num);
            }
        }
        return true;
    }
}