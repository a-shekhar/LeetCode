class Solution {
    public int minMaxDifference(int num) {
        char maxDigit = '0';
        char minDigit = '0';
        String str = String.valueOf(num);
        int n = str.length();
        for(int i = 0; i < n; i++){
            char ch = str.charAt(i);
            if(ch != '9'){
                maxDigit = ch;
                break;
            }
        }
        for(int i = 0; i < n; i++){
            char ch = str.charAt(i);
            if(ch != '0'){
                minDigit = ch;
                break;
            }
        }
        
        String num1 = str.replace(maxDigit, '9');
        String num2 = str.replace(minDigit, '0');

        return Integer.parseInt(num1) - Integer.parseInt(num2);
    }
}