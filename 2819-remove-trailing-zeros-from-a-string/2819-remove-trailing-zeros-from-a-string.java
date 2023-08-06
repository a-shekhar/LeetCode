class Solution {
    public String removeTrailingZeros(String num) {
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i< num.length(); i++){
            stack.push(num.charAt(i));
        }
        while(stack.peek() == '0'){
            stack.pop();
        }
        StringBuilder result = new StringBuilder();
        while(!stack.isEmpty()){
            result.append(String.valueOf(stack.peek()));
            stack.pop();
        }

    return result.reverse().toString();
    }
}