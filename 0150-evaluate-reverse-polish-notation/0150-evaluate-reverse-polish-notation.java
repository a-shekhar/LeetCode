class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        int res = 0;
        int a, b;
        for(String token : tokens){
                switch (token) {
                    case "+":
                        a = stack.pop();
                        b = stack.pop();
                        res = (b + a);
                        stack.push(res);
                        break;
                    case "-":
                        a = stack.pop();
                        b = stack.pop();
                        res = (b - a);
                        stack.push(res);
                        break;    
                    case "*":
                        a = stack.pop();
                        b = stack.pop();
                        res = (b * a);
                        stack.push(res);
                        break;
                    case "/":
                        a = stack.pop();
                        b = stack.pop();
                        res = (b / a);
                        stack.push(res);
                        break;
                    default:
                        stack.push(Integer.valueOf(token));
                        break;                        
                }
        }
        return stack.peek();
    }
}