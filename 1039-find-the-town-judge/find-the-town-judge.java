class Solution {
     public int findJudge(int n, int[][] trust) {
        if(n == 1){
            return 1;
        }
        Set<Integer> set = new HashSet<>();
        Map<Integer, Integer> map = new HashMap<>();
        for (int[] arr : trust) {
            set.add(arr[0]);
            map.put(arr[1], map.getOrDefault(arr[1], 0) + 1);
        }

        if (set.size() != n - 1) {
            return -1;
        }

        for(int key : map.keySet()){
            if(!set.contains(key) && map.get(key) == n-1){
                return key;
            }
        }
        return -1;
    }
}