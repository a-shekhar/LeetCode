class Solution {
    public boolean repeatedSubstringPattern(String s) {
        StringBuilder substr = new StringBuilder();
        int n = 0;
        for(int i=0; i<s.length()-1; i++){
            substr.append(s.charAt(i));
            n++;
            if(s.length() % n == 0 && substr.toString().repeat(s.length()/n).equals(s)){
                return true;
            }
        }
        return false;
    }
}