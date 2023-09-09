class Solution {
    public String freqAlphabets(String s) {
        StringBuilder ans = new StringBuilder();
        for(int i= 0; i < s.length(); i++){
            if(i + 2 < s.length() && s.charAt(i+2) == '#'){
                ans.append((char)(96 + (Integer.valueOf(s.substring(i, i+2)))));
                i += 2;
            }else{
                 ans.append((char)(96  + Character.getNumericValue(s.charAt(i))));
            }
        }
        return ans.toString();
    }
}