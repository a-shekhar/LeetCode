class Solution {
    public int smallestNumber(int n) {
        boolean isAllSet;
        int num;
        for(int i = n;  i < Integer.MAX_VALUE; i++){
            isAllSet = true;
            num = i;
            while(num > 0){
                if(num % 2 == 0){
                    isAllSet = false;
                    break;
                }
                num /= 2;
            }

            if(isAllSet){
                return i;
            }
        }
        return -1;
    }
}