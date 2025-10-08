class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
         ArrayList<ArrayList<Integer>> neighbors = new ArrayList<>();

        for(int i = 0;  i < numCourses; i++){
            neighbors.add(new ArrayList<>());
        }

        int[] indegrees = new int[numCourses];
        
        for(int[] edge : prerequisites){
            int u = edge[0];
            int v = edge[1];
            indegrees[u]++;
            neighbors.get(v).add(u); // neighbors
        }

        Queue<Integer> queue = new LinkedList<>();
        int count = 0;
        
        for(int i = 0; i < indegrees.length; i++){
            if(indegrees[i] == 0){
                queue.offer(i);
            }
        }

        while(!queue.isEmpty()){
            int curr = queue.poll();
            count++;
            for(int neigh : neighbors.get(curr)){
                if(--indegrees[neigh] == 0){
                    queue.offer(neigh);
                }
            }
        }

        return count == numCourses;
    }
}