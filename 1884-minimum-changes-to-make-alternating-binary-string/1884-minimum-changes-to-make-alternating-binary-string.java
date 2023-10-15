class Solution {
    public int minOperations(String s) {
        int diff1 = 0;
        int diff2 = 0;
        for(int i = 0 ; i < s.length(); i++){
            if(i % 2 == 0){
                diff1 = s.charAt(i) == '0' ? diff1 : diff1 + 1;
                diff2 = s.charAt(i) == '1' ? diff2 : diff2 + 1;
            }else {
                diff1 = s.charAt(i) == '1' ? diff1 : diff1 + 1;
                diff2 = s.charAt(i) == '0' ? diff2 : diff2 + 1;
            }
        }
        return Math.min(diff1, diff2);
    }
}