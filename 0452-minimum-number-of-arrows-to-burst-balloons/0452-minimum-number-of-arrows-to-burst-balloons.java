class Solution {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points, (a, b) -> Integer.compare(a[1], b[1]));
        int minEnd = points[0][1];
        int n = points.length - 1;

        int count = 1; // start with 1 
        int i = 1;
        while(i <= n){
            int startCurr = points[i][0];
            if(minEnd >= startCurr){
                // already sorted
                //minEnd = Math.min(minEnd, points[i][1]);
            } else {
                count++;
                minEnd =  points[i][1];
            }
            i++;

        }
    
        return count ;
    }
}