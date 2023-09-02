class Solution {
    public int mostWordsFound(String[] sentences) {
        int maxnum = 0;
        for(String sentence : sentences){
            String[] temp = sentence.split("\\s+");
            maxnum = Math.max(maxnum, temp.length);
        }
        return maxnum;
    }
}