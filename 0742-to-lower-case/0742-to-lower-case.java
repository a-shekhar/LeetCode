class Solution {
    public String toLowerCase(String s) {
        StringBuilder res =  new StringBuilder();
        for(int i=0; i<s.length(); i++){
            if(Character.isUpperCase(s.charAt(i))){
                res.append((char)((int) s.charAt(i) + 32));
            }else{
                res.append(s.charAt(i));
            }
        }
        return res.toString();
    }
}