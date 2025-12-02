class Solution {
    public int countGoodRectangles(int[][] rectangles) {
        int maxLen = 0;
        List<Integer> list = new ArrayList<>();
        for(int[] rect : rectangles){
            int minLen = Math.min(rect[0], rect[1]);
            list.add(minLen);
            maxLen = Math.max(maxLen, minLen);
        }

        int len = maxLen;
        return (int) list.parallelStream().filter(num -> num == len).count();
    }
}