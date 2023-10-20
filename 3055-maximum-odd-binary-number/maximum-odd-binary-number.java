class Solution {
    public String maximumOddBinaryNumber(String s) {
        String ans = "";
        int zeros = 0;
        int ones = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '1'){
                ones++;
            }else{
                zeros++;
            }
        }
        return "1".repeat(ones-1) + "0".repeat(zeros) + "1";
    }
}