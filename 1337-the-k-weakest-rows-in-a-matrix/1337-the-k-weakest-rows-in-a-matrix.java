class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
         int n = mat.length;
        int m = mat[0].length;
        int count = 0;
        int[] res = new int[k];
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < n; i++){
            count  = 0; 
            for(int j = 0; j < m; j++){
                if(mat[i][j] == 1) 
                   count++;
            }
            map.put(i, count);
        }

        return map.entrySet().stream()
        .sorted(Comparator.comparing(Map.Entry<Integer, Integer>::getValue).thenComparing(Map.Entry::getKey))
        .limit(k)
        .map(Map.Entry::getKey)   // Stream<Integer>
        .mapToInt(Integer::intValue)  // IntStream
        .toArray();
    }
}