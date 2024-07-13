class Solution {
    public String clearDigits(String s) {
        Stack<Character> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for(char ch : s.toCharArray()){
            if(Character.isDigit(ch)){
                if(!stack.isEmpty()){
                    stack.pop();
                }
            }else{
                stack.push(ch);
            }
        }
        while(!stack.isEmpty()){
            sb.insert(0, stack.pop());
        }
        return sb.toString();
    }
}