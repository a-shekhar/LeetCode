class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        Set<Integer> seen = new HashSet<>();
        int n = grid.length;
        int[] ans = new int[2];
        int sum = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < grid[0].length; j++){
                if(seen.contains(grid[i][j])){
                    ans[0] = grid[i][j];
                } else {
                    sum += grid[i][j];
                    seen.add(grid[i][j]);
                }
            }
        }

        n =  (int) Math.pow(n, 2);
        int totalSum = (n * (n + 1))/2;
        System.out.println(totalSum);
        ans[1] = totalSum - sum;
        return ans;
    }
}