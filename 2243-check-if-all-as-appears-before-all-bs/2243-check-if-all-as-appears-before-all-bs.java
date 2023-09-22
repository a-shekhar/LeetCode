class Solution {
    public boolean checkString(String s) {
        int index = s.indexOf("b");
        if(index == -1){
            return true;
        }
        for(int i = index+1; i < s.length(); i++){
            if(s.charAt(i) == 'a'){
                return false;
            }
        }
        return true;
    }
}