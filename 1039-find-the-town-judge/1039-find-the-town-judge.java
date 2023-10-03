class Solution {
    public int findJudge(int n, int[][] trust) {
        if(n == 1 && trust.length == 0){
                return 1;
        }
        Set<Integer> people = new HashSet<>();
        Map<Integer, Integer> judge = new HashMap<>();
        for(int[] arr : trust){
            people.add(arr[0]);
            judge.putIfAbsent(arr[1], 0);
            judge.put(arr[1], judge.get(arr[1]) + 1);
        }

        if(people.size() != n-1){
            return  -1;
        }


        for(Map.Entry<Integer, Integer> entry : judge.entrySet()){
            if(!people.contains(entry.getKey()) && entry.getValue() == n-1){
                return entry.getKey();
            }
        }

        return -1;
    }
}