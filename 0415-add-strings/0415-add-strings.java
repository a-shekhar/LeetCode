class Solution {
  public String addStrings(String num1, String num2) {
        int i = num1.length()-1;
        int j = num2.length()-1;
        int digit1, digit2, carry = 0;
        StringBuilder ans = new StringBuilder();
        int sum = 0;
        while(i >= 0 || j >= 0){
            digit1 = i < 0 ? 0 : Character.getNumericValue(num1.charAt(i));
            digit2 = j < 0 ? 0 : Character.getNumericValue(num2.charAt(j));
            sum = digit1 + digit2 + carry;
            carry = sum/10;
            ans.insert(0, sum % 10);
            i--;
            j--;
        }
        if(carry == 1){
            ans.insert(0, 1);
        }
        return ans.toString();
    }
}