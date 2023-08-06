class Solution {
    public void reverseString(char[] s) {
        char temp;
        int len = s.length;
    
        for(int i = 0; i < len/2; i++){
            temp = s[i];
            s[i] = s[len-i-1];
            s[len-i-1] = temp;
        }
    }
}