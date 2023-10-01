class Solution {
    public int[] evenOddBit(int n) {
        boolean evenFlag = true;
        int even = 0;
        int odd = 0;
        int rem = 0;
        while (n > 0){
            rem = n % 2;
            if(rem == 1) {
                if (evenFlag) {
                    even++;
                } else {
                    odd++;
                }
            }
            n /= 2;
            evenFlag = !evenFlag;
        }

        return new int[]{ even, odd };
    }
}