class Solution {
    public static int[][] sorted(int[][] intervals) {
        Comparator<int[]> comparator = new Comparator<>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[1] - o2[1];
            }
        };
        Arrays.sort(intervals, comparator);
        return intervals;
    }

    public int eraseOverlapIntervals(int[][] intervals) {
        // sort the intervals based on finish time
        intervals = sorted(intervals);
        // choose the first activity (interval)
        int[] prevActivity = intervals[0];
        // good intervals, starting with 1 since we have already selected
        // first activity
        int count = 1;
        for(int i = 1; i < intervals.length; i++) {
            if(intervals[i][0] >= prevActivity[1]){
                count++;
                prevActivity = intervals[i];
            }
        }
        // intervals to remove
        return intervals.length - count;
    }
}