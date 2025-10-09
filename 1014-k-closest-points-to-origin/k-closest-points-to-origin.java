class Solution {
    public int[][] kClosest(int[][] points, int k) {
        int[][] result = new int[k][2];
        PriorityQueue<int[]> pq = new PriorityQueue<>((p1, p2) -> Integer.compare(
                            (p2[0] * p2[0]) + (p2[1] * p2[1]) , 
                            (p1[0] * p1[0]) + (p1[1] * p1[1])
                            ));
        for(int[] point : points){
            pq.offer(point);
            if(pq.size() > k){
                pq.poll();
            }
        }

        int i = 0;
        while(!pq.isEmpty()){
            result[i++] = pq.poll();
        }
        return result;
    }
}