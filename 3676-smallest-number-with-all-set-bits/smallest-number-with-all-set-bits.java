class Solution {
     public int smallestNumber(int n) {
        int num = n;
        boolean isBitSet;

        while (true) { 
            isBitSet = true;
            num = n;
            while(num > 0){
                if(num%2 == 0) {
                    isBitSet = false;
                    n++;
                    break;
                } 
                num /= 2;
            }
            if(isBitSet) break;
        }
        
        return n;
    }
}