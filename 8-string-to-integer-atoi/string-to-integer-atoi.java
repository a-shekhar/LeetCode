class Solution {
    public int myAtoi(String s) {
        s = s.stripLeading();
        if(s.isBlank()) return 0;
        boolean isNeg = false;
        if(s.charAt(0) == '-') isNeg = true;
        long num = 0;
        int i = (isNeg) || s.charAt(0) == '+' ? 1 : 0;
        int n = s.length();
        while(i < n){
            char ch = s.charAt(i);
            if(num == 0 && ch == '0') {
                i++;
                continue;
            }
            if(!Character.isDigit(ch)){
                break;
            }
            int rem = ch - '0';
            num = (num * 10) + rem;
            if(isNeg &&  - num <= Integer.MIN_VALUE) return Integer.MIN_VALUE;
            if(!isNeg && num >= Integer.MAX_VALUE) return  Integer.MAX_VALUE; 
            i++;
        }
        return isNeg ? (int) -num : (int) num;
    }
}