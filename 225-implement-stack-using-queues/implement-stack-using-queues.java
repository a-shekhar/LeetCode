class MyStack {

    Queue<Integer> pushedQueue;
    Queue<Integer> poppedQueue;

    public MyStack() {
        pushedQueue = new LinkedList<>();
        poppedQueue = new LinkedList<>();

    }
    
    public void push(int x) {
        pushedQueue.offer(x);
    }

    public int pop() {
        while(pushedQueue.size() > 1){
            poppedQueue.offer(pushedQueue.poll());
        }
        int poppedItem =  pushedQueue.poll();
        while(!poppedQueue.isEmpty()){
            pushedQueue.offer(poppedQueue.poll());
        }
        return poppedItem;
    }

    public int top() {
        while(pushedQueue.size() > 1){
            poppedQueue.offer(pushedQueue.poll());
        }
        int peekedItem = pushedQueue.peek();
        poppedQueue.offer(pushedQueue.poll());
        while(!poppedQueue.isEmpty()){
            pushedQueue.offer(poppedQueue.poll());
        }
        return peekedItem;
    }

    public boolean empty() {
        return pushedQueue.isEmpty() && poppedQueue.isEmpty();
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