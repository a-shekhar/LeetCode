class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
int n = rooms.size();
       Deque<Integer> queue = new ArrayDeque<>();
       boolean[] visited = new boolean[n];
       int popped;
       int seen = 1;
       visited[0] = true;
       queue.offer(0);
       while(!queue.isEmpty()){
           popped = queue.poll();
           for(int neighbor : rooms.get(popped)){
               if(!visited[neighbor]){
                   visited[neighbor] = true;
                   queue.offer(neighbor);
                   if(++seen == n){
                        return true; // early exit 
                   }
               }
           }
       }
       return seen == n;
    }
}