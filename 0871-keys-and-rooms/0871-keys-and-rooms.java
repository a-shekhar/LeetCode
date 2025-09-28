class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
         int n = rooms.size();
        Set<Integer> visited = new HashSet<>();
        Deque<Integer> queue = new ArrayDeque<>();
        int popped;
        visited.add(0);
        queue.offer(0);
        while(!queue.isEmpty()){
            popped = queue.poll();
            for(int neighbor : rooms.get(popped)){
                if(!visited.contains(neighbor)){
                    visited.add(neighbor);
                    queue.offer(neighbor);
                }
            }
        }
        return visited.size() == n;
    }
}