class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
         int[] result = new int[temperatures.length];

        Stack<Integer> stack = new Stack<>();

          for (int i = temperatures.length - 1; i >= 0; i--) {
            // Pop indices with temperatures <= current temperature
            while (!stack.isEmpty() && temperatures[i] >= temperatures[stack.peek()]) {
                stack.pop();
            }

            // If the stack is not empty, the top is the next warmer day
            result[i] = stack.isEmpty() ? 0 : stack.peek() - i;

            // Push current index to stack
            stack.push(i);
        }

        return result;
    }
}