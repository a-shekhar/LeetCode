class Solution {
    public boolean checkEqual(String s){
        int i = 0;
        int j = s.length() - 1;
        while(i < j){
            if(s.charAt(i++) != s.charAt(j--)) return false;
        }
        return true;
    }

    public boolean validPalindrome(String s) {
        if(checkEqual(s)) return true; 
        
        int i = 0;
        int j = s.length() - 1;

        while(i < j){
            if(s.charAt(i) != s.charAt(j)) {
                String skipI = s.substring(0, i) + s.substring(i+1);
                String skipJ = s.substring(0, j) + s.substring(j+1);        
                return checkEqual(skipI) || checkEqual(skipJ);
            }
            i++;
            j--;
        }
      
        return true;
    }
}