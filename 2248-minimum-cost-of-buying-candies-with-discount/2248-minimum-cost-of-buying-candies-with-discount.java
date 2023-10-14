class Solution {
    public int minimumCost(int[] cost) {
        Arrays.sort(cost);
        int start  = 0;
        int sum  = 0;
        for(int j = cost.length-1; j >= 0; j--){
            start++;
            if(start % 3 != 0){
                sum += cost[j];
            }
        }
        return sum;
    }
}