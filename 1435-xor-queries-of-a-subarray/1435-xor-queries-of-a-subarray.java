class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
        int[] xorArr = new int[queries.length];
        int xor;
        for(int i= 0; i < queries.length; i++){
            xor = 0;
            System.out.println(queries[i][0] + " " + queries[i][1]);
            for(int j=queries[i][0]; j<=queries[i][1];  j++){
                xor ^= arr[j];
            }
            xorArr[i] = xor;
        }
        return xorArr;
    }
}