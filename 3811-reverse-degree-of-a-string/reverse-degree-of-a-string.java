class Solution {
    public int reverseDegree(String s) {
        int degree = 0;
        for(int i = 0; i < s.length(); i++) {
            degree += (i+1) * (123 - (int) s.charAt(i));
        }
       
        return degree;
    }
}