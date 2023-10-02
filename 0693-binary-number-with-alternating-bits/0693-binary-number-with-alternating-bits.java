class Solution {
     public boolean hasAlternatingBits(int n) {
        int lastbit = -1;
        while(n > 0){
            if(n % 2 == lastbit){
                return false;
            }
            lastbit = n % 2;
            n /= 2;
        }
        return true;
    }
}