class Solution {
    public String addBinary(String a, String b) {
        int carry = 0;
        StringBuilder builder = new StringBuilder();
        int sum = 0;
        int i = a.length() - 1;
        int j = b.length() - 1;
        int digit1, digit2 = 0;
        while(i >= 0 || j >= 0){
            digit1 = (i >= 0 ? a.charAt(i) - '0' : 0);
            digit2 = (j >= 0 ? b.charAt(j) - '0' : 0);
            
            sum = digit1 + digit2 + carry;

            builder.append(sum%2);

            carry = sum / 2;
            i--;
            j--;
        }

        if(carry == 1){
            builder.append("1");
        }

        return builder.reverse().toString();
    }
}