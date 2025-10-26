class SmallestInfiniteSet {

    boolean[] nums;
    PriorityQueue<Integer> pq;

    public SmallestInfiniteSet() {
        nums = new boolean[1001];
        pq = new PriorityQueue<>();
        Arrays.fill(nums, true);
        for(int i = 1; i <= 1000; i++) pq.offer(i);

    }
    
    public int popSmallest() {
        int x = pq.poll();
        nums[x] = false;
        return x;
    }
    
    public void addBack(int num) {
        if(nums[num]){
            return;
        }
        nums[num] = true;
        pq.offer(num);
    }
}

/**
 * Your SmallestInfiniteSet object will be instantiated and called as such:
 * SmallestInfiniteSet obj = new SmallestInfiniteSet();
 * int param_1 = obj.popSmallest();
 * obj.addBack(num);
 */