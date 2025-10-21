class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {
        // create vertex
        List<List<int[]>> adjList = new ArrayList<>();

        for(int i = 0; i <= n; i++){
            adjList.add(new ArrayList<>());
        }

        for(int[] time : times){
            int u = time[0];
            int v = time[1];
            int w = time[2];
            adjList.get(u).add(new int[]{v, w}); // directed graph
        }

        // dist array 
        int[] dist = new int[n+1];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[k] = 0; // source

        // priority queue (offer source and distance)
        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a[1]));
        pq.offer(new int[]{k, 0}); // source
        Set<Integer> seen = new HashSet();

        while(!pq.isEmpty()){
            int[] curr = pq.poll();
            int u = curr[0]; // source
            int d = curr[1]; // distance
            seen.add(u);

            if(d > dist[u]){
                continue; // skip 
            }

            for(int[] neigh : adjList.get(u)){
                int v = neigh[0];
                int w = neigh[1];
                int currDist = dist[u] + w;
                if(currDist < dist[v]){
                    dist[v] = currDist;
                    pq.offer(new int[]{v, currDist});
                }
            }
        }

        if(seen.size() != n){
            return -1;
        }

        int maxval = 0;
        for(int i = 1; i <=n; i++){
            maxval = Math.max(maxval, dist[i]);
        }
        return maxval;
    }
}