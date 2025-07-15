class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        List<String> operators = Arrays.asList("+", "-", "*", "/");
        int res = 0;
        for(String token : tokens){
            if(!operators.contains(token)){
                stack.push(Integer.valueOf(token));
            }else{
                int a = stack.pop();
                int b = stack.pop();
                switch (token) {
                    case "+":
                        res = (b + a);
                        break;
                    case "-":
                        res = (b - a);
                        break;    
                    case "*":
                        res = (b * a);
                        break;
                    case "/":
                        res = (b / a);
                        break;
                    default:
                        break;                        
                }

                stack.push(res);
            }
        }
        return stack.peek();
    }
}