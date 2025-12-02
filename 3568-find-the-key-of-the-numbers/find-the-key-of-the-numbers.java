class Solution {
    public int generateKey(int num1, int num2, int num3) {
        String str1 = String.format("%4s", num1).replace(' ', '0');
        String str2 = String.format("%4s", num2).replace(' ', '0');
        String str3 = String.format("%4s", num3).replace(' ', '0');

        StringBuilder builder = new StringBuilder();
        for(int i = 0; i < 4; i++){
            int d1 = str1.charAt(i) - '0';
            int d2 = str2.charAt(i) - '0';
            int d3 = str3.charAt(i) - '0';

            int min = Math.min(d1, Math.min(d2, d3));
            builder.append(min);
        }

        return  Integer.parseInt(builder.toString());
    }
}