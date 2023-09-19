class Solution {
    public boolean isPrefixString(String s, String[] words) {
        String temp = "";
        for(String word: words) {
            temp += word;
            if(!s.startsWith(temp)){
                return false;
            }
            if(temp.equals(s)){
                return true;
            }
        }
        return  temp.equals(s);
    }
}