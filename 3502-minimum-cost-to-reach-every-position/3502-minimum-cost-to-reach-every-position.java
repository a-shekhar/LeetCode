class Solution {
    public int[] minCosts(int[] cost) {
        int[] res = new int[cost.length];
        int minSoFar = Integer.MAX_VALUE;
        int index = 0;
        for(int num : cost){
            minSoFar = Math.min(num, minSoFar);
            res[index++] = minSoFar;
        }
        return res;
    }
}