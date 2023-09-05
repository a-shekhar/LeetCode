class Solution {
    public String addBinary(String a, String b) {
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;
        int sum = 0;
        StringBuilder ans = new StringBuilder();

        while(i >= 0 || j >= 0 || carry > 0){
            int digit1 = (i >= 0) ? Integer.parseInt(String.valueOf(a.charAt(i))) : 0; 
            int digit2 = (j >= 0) ? Integer.parseInt(String.valueOf(b.charAt(j))) : 0; 

            sum = digit1 + digit2 + carry;
            carry = sum/2;
           
            int num = sum % 2;

            ans.append(num);

            i--;
            j--;
        } 
        return ans.reverse().toString();
    }
}