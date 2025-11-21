class Solution {
    public boolean isLongPressedName(String name, String typed) {
        if(name.charAt(0) != typed.charAt(0)) return false;
        int j = 1;
        int i = 1;
        while(i < name.length()){
            if(j >= typed.length()) return false;
            if(name.charAt(i) == typed.charAt(j)){
                i++;
                j++;
            } else {
                if(name.charAt(i-1) != typed.charAt(j)) return false;
                j++;
            }
        }
        while(j < typed.length() && name.charAt(name.length()-1) == typed.charAt(j)) j++;
        if(j < typed.length()) return false;
                System.out.println(i);

        if(i < name.length()) return false;
        return true;
    }
}