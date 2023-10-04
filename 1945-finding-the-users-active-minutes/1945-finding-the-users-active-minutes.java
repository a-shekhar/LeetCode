class Solution {
    public int[] findingUsersActiveMinutes(int[][] logs, int k) {
        int[] ans = new int[k];
        HashMap<Integer, Set<Integer>> map = new HashMap<>();
        Set<Integer> set;
        for(int[] log : logs){
           set = map.getOrDefault(log[0], new HashSet<>());
           set.add(log[1]);
           map.put(log[0], set);
        }

        List<Integer> values = new ArrayList<>();
        for(Set<Integer> val : map.values()){
            values.add(val.size());
        }

        for(Integer val : values){
            ans[val-1]++;
        }
        return ans;
    }
}