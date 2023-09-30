class Solution {
     public boolean checkZeroOnes(String s) {
        int ones = 0;
        int zero = 0;

        if(s.charAt(0) == '0'){
            zero = 1;
        }else {
            ones = 1;
        }
        int maxZero = zero;
        int maxOnes = ones;
        for(int i = 1; i< s.length(); i++){
            if(s.charAt(i) == '1' && s.charAt(i-1) == s.charAt(i)){
                ones++;
            } else if (s.charAt(i) == '1' && s.charAt(i-1) != s.charAt(i)) {
                ones = 1;
            } else if (s.charAt(i) == '0' && s.charAt(i-1) == s.charAt(i)) {
                zero++;
            } else if (s.charAt(i) == '0' && s.charAt(i-1) != s.charAt(i)) {
                zero = 1;
            }
            maxZero = Math.max(zero, maxZero);
            maxOnes = Math.max(ones, maxOnes);
        }
        return maxOnes > maxZero;
    }
}