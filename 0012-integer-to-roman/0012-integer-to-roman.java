class Solution {
    public String intToRoman(int num) {
        int[] values = new int[] {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] keys = new String[] {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"}; 

        int i = 0;
        StringBuilder builder = new StringBuilder();
        while(num > 0){
            if(num >= values[i]){
                builder.append(keys[i]);
                num -= values[i];
            } else {
                i++;
            }
        }
        return builder.toString();
    }
}