class Solution {
    public boolean checkEqual(String s, int i , int j){
        while(i < j){
            if(s.charAt(i++) != s.charAt(j--)) return false;
        }
        return true;
    }

    public boolean validPalindrome(String s) {
        
        int i = 0;
        int j = s.length() - 1;

        while(i < j){
            if(s.charAt(i) != s.charAt(j)) {
                return checkEqual(s, i+1, j) || checkEqual(s, i, j-1);
            }
            i++;
            j--;
        }
      
        return true;
    }
}