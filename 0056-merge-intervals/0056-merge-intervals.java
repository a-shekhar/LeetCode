class Solution {
    public int[][] merge(int[][] intervals) {
                Arrays.sort(intervals, Comparator.comparing(row -> row[0]));

        ArrayList<int[]> result = new ArrayList<>();
        int startT = intervals[0][0];
        int endT = intervals[0][1];

        for(int i = 1;  i < intervals.length; i++){
            if(endT >= intervals[i][0]){
                endT = Math.max(endT, intervals[i][1]);
            } else {
                result.add(new int[]{startT, endT});
                startT = intervals[i][0];
                endT = intervals[i][1];
            }
        }
         // add for last entry
         result.add(new int[]{startT, endT});
         return result.toArray(new int[0][]);
    }
}