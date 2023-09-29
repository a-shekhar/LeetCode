class Solution {
    public int maxScore(String s) {
        int zeros = 0;
        int ones = 0;
        int maxSum = 0;
        for(int i = 0;  i < s.length(); i++){
            if(s.charAt(i) == '1'){
                ones++;
            }
        }

        for(int i = 0;  i < s.length() - 1; i++){
            if(s.charAt(i) == '0') {
                zeros++;
            }else{
                ones--;
            }
            maxSum = Math.max(zeros + ones, maxSum);
        }
        return maxSum;
    }
}