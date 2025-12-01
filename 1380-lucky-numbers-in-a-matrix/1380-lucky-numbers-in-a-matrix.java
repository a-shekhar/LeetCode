class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;

        int[] minMap = new int[n];
        Arrays.fill(minMap, Integer.MAX_VALUE);

        int[] maxMap = new int[m];

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                minMap[i] = Math.min(minMap[i], matrix[i][j]);
                maxMap[j] = Math.max(maxMap[j], matrix[i][j]);
            }
        }

        List<Integer> list = new ArrayList<>();

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(minMap[i] == maxMap[j]) list.add(maxMap[j]); 
            }
        }

        return list;
    }
}