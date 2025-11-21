class Solution {
    public boolean isLongPressedName(String name, String typed) {
        
        int j = 0;
        int i = 0;
        while(j < typed.length()){
            if(i < name.length() && name.charAt(i) == typed.charAt(j)){
                i++;
                j++;
            } else if(j > 0 && typed.charAt(j-1) == typed.charAt(j)){
                j++;
            } else {
                return false;
            }
        }
        return i == name.length();
    }
}