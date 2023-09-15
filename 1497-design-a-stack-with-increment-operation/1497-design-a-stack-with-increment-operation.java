class CustomStack {

    List<Integer> stack;
    int maxSize;

    public CustomStack(int maxSize) {
        this.stack = new ArrayList<>();
        this.maxSize = maxSize;
    }
    
    public void push(int x) {
        if(stack.size() < maxSize){
            stack.add(x);
           
        }
        
    }
    
    public int pop() {
    
        if(stack.size() > 0){
            int num = stack.get(stack.size()-1);
            stack.remove(stack.size()-1);
            return num;
        }
        return -1;
    }
    
    public void increment(int k, int val) {
        int n = Math.min(k, stack.size());
        for(int i = 0; i<n; i++){
            stack.set(i, stack.get(i) + val);
        }
    }
}

/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */