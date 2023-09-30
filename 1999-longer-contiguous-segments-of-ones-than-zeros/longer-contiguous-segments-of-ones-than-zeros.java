class Solution {
     public boolean checkZeroOnes(String s) {
        int ones = 0;
        int zeros = 0;
        int maxZero = 0;
        int maxOnes = 0;

        for(int i = 0; i< s.length(); i++){
            if(s.charAt(i) == '1'){
                ones++;
                zeros = 0;
            } else if (s.charAt(i) == '0') {
                zeros++;
                ones = 0;
            }
            maxZero = Math.max(zeros, maxZero);
            maxOnes = Math.max(ones, maxOnes);
        }
        return maxOnes > maxZero;
    }
}