class Solution {
    public String replaceDigits(String s) {
        StringBuilder builder = new StringBuilder();
        for(int i = 0 ; i < s.length(); i++){
            char c = (i % 2 == 0) ? s.charAt(i) :
                    shift(s.charAt(i-1), 
                Character.getNumericValue(s.charAt(i)));
            builder.append(c);
           
        }
        return builder.toString();
    }

    private char shift(char c, int x){
        return (char)((int) c + x);
    }
}