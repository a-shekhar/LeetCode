class Solution {
     public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        StringBuilder builder = new StringBuilder();
        char ch;
        for(int i = 0; i<s.length(); i++){
            ch = s.charAt(i);
            if(Character.isAlphabetic(ch) || Character.isDigit(ch)){
                builder.append(ch);
            }


        }
        String str = builder.toString();
        String reverse = builder.reverse().toString();
        return str.equals(reverse);
    }
}