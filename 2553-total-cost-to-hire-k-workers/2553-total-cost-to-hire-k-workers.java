class Solution {
    public long totalCost(int[] costs, int k, int candidates) {
        PriorityQueue<Integer> pq1 = new PriorityQueue<>();
        PriorityQueue<Integer> pq2 = new PriorityQueue<>();
        int i = 0;
        int j = costs.length - 1;
        int n = costs.length;
        while(pq1.size() < candidates && i <= j){
            pq1.offer(costs[i++]);
        }

        while(pq2.size() < candidates && i <= j){
            pq2.offer(costs[j--]);
        }

        long price = 0;
        while(k > 0){
            int x = pq1.isEmpty()  ? Integer.MAX_VALUE : pq1.peek();
            int y = pq2.isEmpty() ? Integer.MAX_VALUE : pq2.peek();

            if(x <= y){
                price += x;
                pq1.poll();
                if(i <= j){
                    pq1.offer(costs[i]);
                    i++;
                }
            } else {
                price += y;
                pq2.poll();
                if(i <= j){
                    pq2.offer(costs[j]);
                    j--;
                }
            }
            k--;
        }

        return price;
    }
}