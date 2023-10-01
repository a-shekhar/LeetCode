class Solution {
    public String reverseWords(String s) {
        StringBuilder reversed = new StringBuilder();
        Stack<Character> st = new Stack<>();
        for(int i=0; i<= s.length(); i++){
            if(i == s.length() || s.charAt(i) == ' ' ){
                while(!st.isEmpty()){
                    reversed.append(st.pop());
                }
                reversed.append(" ");
            }else{
                st.push(s.charAt(i));
            }
        }
        return reversed.toString().trim();
    }
}