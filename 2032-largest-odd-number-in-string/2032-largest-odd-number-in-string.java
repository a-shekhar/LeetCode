class Solution {
    public String largestOddNumber(String num) {

        for(int j = num.length() - 1; j >=0 ; j--){
            if(Character.getNumericValue(num.charAt(j)) % 2 == 1){
                return num.substring(0, j+1);
            }
        }
        return "";
    }

}