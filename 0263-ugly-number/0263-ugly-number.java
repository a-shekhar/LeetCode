class Solution {
    public boolean isUgly(int n) {
        int x = n;
        while(n > 0){
            x = n;

            if(n % 5 == 0){
               n /= 5;
            }

            if(n % 3 == 0){
                n /= 3;
            }

            if(n % 2 == 0){
                n /=2;
            }

            if(n == 1){
                return true;
            }

            if(n == x){
                return false;
            }

        }

        return false;
    }
}