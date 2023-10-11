class Solution {
      public String longestPalindrome(String s) {
        String ans = "";
        StringBuilder str1;
        StringBuilder str2;
        int maxLen = 0;
        for(int i= 0; i < s.length(); i++){
            str1 = new StringBuilder();
            str2 = new StringBuilder();
            for(int j= i; j <s.length(); j++){
                str1.append(s.charAt(j));
                str2.insert(0, s.charAt(j));
               
                if(str1.toString().contentEquals(str2) && maxLen < str1.length()){
                    ans = str2.toString();
                    maxLen = str1.length();
                }
            }

        }
        return  ans;
    }
}