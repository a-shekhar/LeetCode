class Solution {
     public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(char ch : s.toCharArray()){
                if (ch == ')' && !stack.empty() && stack.peek() == '('){
                    stack.pop();
                }else if (ch == ']'  && !stack.empty() && stack.peek() == '['){
                    stack.pop();
                }else if (ch == '}'  && !stack.empty() && stack.peek() == '{'){
                    stack.pop();
                }else{
                    stack.push(ch);
                }
        }
        return stack.empty();
    }
}