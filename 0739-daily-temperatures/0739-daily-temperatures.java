class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
         Deque<Integer> stack = new ArrayDeque<>(); // will store  index here
        int n = temperatures.length;
        int[] result = new int[n];

        for(int i = n - 1; i >= 0; i--){
            if(!stack.isEmpty()){
                while(!stack.isEmpty() && temperatures[i] >= temperatures[stack.peek()]){
                    stack.pop();
                }
            } 

            if(stack.isEmpty()){
                result[i] = 0;
            } else {
                result[i] = stack.peek() - i;
            }
            
            stack.push(i);
        }
        return result;
    }
}