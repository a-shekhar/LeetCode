class Solution {
    public String longestCommonPrefix(String[] strs) {
         int n = strs[0].length();
        
        for(int i = 0;  i < n; i++){
            char ch = strs[0].charAt(i);
            for(int j = 1; j < strs.length; j++){ // iterate others
                if(i == strs[j].length() || strs[j].charAt(i) != ch) { // either end of string or not eual to 
                    return strs[0].substring(0, i);
                }
            }
        }
        return strs[0];
    }
}