class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> st = new Stack<>();
        for(int i =0 ; i <s.length(); i++){
            if(!st.isEmpty() && s.charAt(i) == st.peek()){
                st.pop();
            }else{
                st.push(s.charAt(i));
            }
        }
        StringBuilder build = new StringBuilder();
        while(!st.isEmpty()){
            build = build.append(st.pop());
        }
        return build.reverse().toString();
    }
}