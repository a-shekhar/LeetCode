class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.length() == 0){
            return true;
        }
        int index  = 0;
        String sub  = "";
        for(int i = 0; i < t.length(); i++){ 
            if(s.charAt(index) == t.charAt(i)){
                sub += s.charAt(index);
                index++;
            }
            if(sub.equals(s)){
                return true;
            }
        }
        return false;
    }
}