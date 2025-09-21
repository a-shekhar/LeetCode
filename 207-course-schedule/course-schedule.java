class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        int count = 0;
        ArrayList<ArrayList<Integer>> neighborsList = new ArrayList<>();
        Deque<Integer> queue = new ArrayDeque<>();
        int[] indegrees = new int[numCourses];
        for(int i = 0; i < numCourses; i++){
            neighborsList.add(new ArrayList<>());
        }

        for(int[] edge : prerequisites){
            ArrayList<Integer> neighbors = neighborsList.get(edge[0]);
            neighbors.add(edge[1]);
            indegrees[edge[1]]++;
        }

        for(int i = 0;  i < numCourses; i++){
            if(indegrees[i] == 0){
                queue.offer(i);
            }
        }

        while(!queue.isEmpty()){
            Integer polled = queue.poll();
            count++;
            for(int neighbor : neighborsList.get(polled)){
                indegrees[neighbor]--;
                if(indegrees[neighbor] == 0){
                    queue.offer(neighbor);
                }
            }
        }
        return numCourses == count;
    }
}