class Solution {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points, (a, b) -> Integer.compare(a[1], b[1]));
        System.out.println(Arrays.deepToString(points));
        int minEnd = points[0][1];
        boolean overlapped = false;
        int n = points.length - 1;

        int count = 0;
        int i = 1;
        while(i <= n){
            int startCurr = points[i][0];
            int endPrev = points[i-1][1];
            if(minEnd >= startCurr){
                minEnd = Math.min(minEnd, points[i][1]);
                i++;
            } else {
                count++;
                minEnd =  points[i][1];
                i++;
            }

        }
        return count + 1;
    }
}