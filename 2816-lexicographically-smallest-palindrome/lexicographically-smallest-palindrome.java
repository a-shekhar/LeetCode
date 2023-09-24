class Solution {
     public String makeSmallestPalindrome(String s) {
        StringBuilder str = new StringBuilder(s);
        int n = str.length();
        for (int i = 0; i <= str.length()/2; i++){
            if(str.charAt(i) != str.charAt(n-1-i)){
                if(str.charAt(i) > str.charAt(n-1-i)){
                    str.setCharAt(i, str.charAt(n-1-i));
                }else{
                    str.setCharAt(n-1-i, str.charAt(i));
                }
            }
        }
        return  str.toString();
    }
}