class Solution {
    public int countGoodRectangles(int[][] rectangles) {
        int maxLen = 0;
        int count = 0;
        for(int[] rect : rectangles){
            int minLen = Math.min(rect[0], rect[1]);
            if(minLen > maxLen){
                maxLen = minLen;
                count = 1;
            } else if(minLen == maxLen){
                count++;
            }
        }
        return count;
    }
}