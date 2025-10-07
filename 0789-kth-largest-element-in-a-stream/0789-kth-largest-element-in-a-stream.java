class KthLargest {

    PriorityQueue<Integer> pq;
    int k;
    //List<Integer> list;

    
    public KthLargest(int k, int[] nums) {
        pq = new PriorityQueue<>();
        this.k = k;
        for(int num : nums){
            pq.offer(num);
            if (pq.size() > k) pq.poll(); // keep only k largest

        }
    }
    
    public int add(int val) {
        //int temp = -1;
        pq.offer(val);
        //System.out.println(pq);
        while(pq.size() > k){
             pq.poll();
        }

        //temp = pq.peek();

        // while(!list.isEmpty()){
        //     pq.offer(list.get(list.size()-1));
        // }
        return pq.peek();
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */