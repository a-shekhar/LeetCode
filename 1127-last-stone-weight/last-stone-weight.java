class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a , b) -> Integer.compare(b, a));
        for(int num : stones){
            pq.offer(num);
        }

        while(pq.size() > 1){
            int x = pq.poll();
            int y = pq.poll();
            if(x != y){
                pq.offer(Math.abs(y-x));
            }
        }
        return pq.isEmpty() ? 0 : pq.peek();
    }
}