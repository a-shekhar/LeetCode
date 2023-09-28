class Solution {
    public String reverseOnlyLetters(String s) {
        int i = 0;
        int j = s.length()-1;
        StringBuilder ans = new StringBuilder(s);
        while(i < j){
            if(!Character.isAlphabetic(s.charAt(i))){
                i++;
            }else if(!Character.isAlphabetic(s.charAt(j))){
                j--;
            }else{
               ans.setCharAt(i, s.charAt(j));
               ans.setCharAt(j, s.charAt(i));
               i++;
               j--;
            }
        }
        return ans.toString();
    }
}