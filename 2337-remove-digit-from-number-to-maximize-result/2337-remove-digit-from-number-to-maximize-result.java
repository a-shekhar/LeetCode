class Solution {
    public String removeDigit(String number, char digit) {
        for(int i = 0; i < number.length() - 1; i++){
            if(number.charAt(i) == digit && Character.getNumericValue(number.charAt(i)) < Character.getNumericValue(number.charAt(i+1))){
                return number.substring(0, i) + number.substring(i+1);
            }
        }
        for(int j = number.length()-1; j >= 0; j--){
            if(number.charAt(j) == digit){
                return number.substring(0, j) + number.substring(j+1);
            }
        }
        return "";
    }
}