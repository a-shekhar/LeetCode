class Solution {
    public String makeGood(String s) {
        Stack<Character> st = new Stack<>();
        for(char c : s.toCharArray()){
            if(!st.isEmpty() && Character.isUpperCase(c)
                    && Character.toUpperCase(st.peek()) == c
                    && Character.isLowerCase(st.peek())){
                st.pop();
            } else if (!st.isEmpty() && Character.isLowerCase(c)
                    && Character.toLowerCase(st.peek()) == c
                    && Character.isUpperCase(st.peek())) {
                st.pop();
            }else {
                st.push(c);
            }
        }
        
        StringBuilder build  = new StringBuilder();
        while(!st.isEmpty()){
            build.insert(0, st.pop());
        }
        return build.toString();
    }
}