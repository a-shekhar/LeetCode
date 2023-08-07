class Solution {
    public String convertToBase7(int num) {
        if(num == 0){
            return "0";
        }
        String result="";
        boolean isnegative = false;
        int rem = 0;
        if(num < 0){
            isnegative = true;
            num = Math.abs(num);
        }
        while(num > 0){
            rem = num % 7;
            result = String.valueOf(rem) + result;
            num /= 7;
        }

        if(isnegative){
            result = "-" + result;
        }
        return result;
    }
}