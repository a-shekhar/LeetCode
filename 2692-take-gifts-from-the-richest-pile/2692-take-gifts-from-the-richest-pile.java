class Solution {
    public long pickGifts(int[] gifts, int k) {
        int n = 1;
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        for(int gift : gifts){
            queue.offer(gift);
        }
        
        long sum = 0;
        while(n <= k){
            int temp = queue.poll();
            queue.offer((int) Math.floor(Math.sqrt(temp)));
            n++;
        }
        while ((!queue.isEmpty())){
            sum += queue.poll();
        }
        return sum;
    }
}