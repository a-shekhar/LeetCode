class Solution {
    public int largestAltitude(int[] gain) {
        int max = 0;
        int prev = 0;
        for(int alt : gain){
            prev += alt;
            max = Math.max(max, prev);
        }
        return max;
    }
}