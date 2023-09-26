class Solution {
    public int[] numberOfLines(int[] widths, String s) {
        int pixel = 0;
        int lines = 1;
        for(int ch : s.toCharArray()){
            if(pixel + widths[ch-97] > 100){
                lines += 1;
                pixel = widths[ch-97];
            }else {
                pixel += widths[ch-97];
            }
        }
        return new int[]{lines, pixel};
    }
}