class Solution {
    public int countEven(int num) {
        if(num == 1){
            return 0;
        }
        int n = 0;
        int sum = 0;
        int count = 0;
        for(int i = 2; i <= num; i++){
            n = i;
            sum = 0;
            while(n > 0){
                sum += n % 10;
                n /= 10;
            }

            if(sum % 2 == 0){
                count++;
            }
        }
        return count;
    }
}