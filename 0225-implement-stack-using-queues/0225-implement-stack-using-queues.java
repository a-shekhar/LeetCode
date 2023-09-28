class MyStack {
    Queue<Integer> first;
    Queue<Integer> second;

    public MyStack() {
        first = new LinkedList<>();
        second = new LinkedList<>();
    }

    public void push(int x) {
        first.offer(x);
    }

    public int pop() {
        int top = 0;
        while (first.size() > 1){
            second.offer(first.poll());
        }
        top = first.poll();
        
        while (!second.isEmpty()){
            first.offer(second.poll());
        }
        
        return top;
    }

    public int top() {
        int top = 0;
        while (!first.isEmpty()){
            top = first.poll();
            second.offer(top);
        }

        while (!second.isEmpty()){
            first.offer(second.poll());
        }

        return top;
    }

    public boolean empty() {
        return first.isEmpty() && second.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */