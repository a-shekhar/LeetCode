class MyQueue {

    Stack<Integer> pushed;
    Stack<Integer> popped;

    public MyQueue() {
        pushed = new Stack<>();
        popped = new Stack<>();
    }
    
    public void push(int x) {
        while(!popped.isEmpty()){
            pushed.push(popped.pop());
        }
        pushed.push(x);
    }

    public int pop() {
        while (!pushed.isEmpty()) {
            popped.push(pushed.pop());
        }
        return popped.pop(); 
    }

    public int peek() {
        while (!pushed.isEmpty()) {
            popped.push(pushed.pop());
        }
        return popped.peek();
    }

    public boolean empty() {
        return pushed.isEmpty() && popped.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */