class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        int[] order = new int[numCourses];
        int index = 0;

        // build neighbors 
        ArrayList<ArrayList<Integer>> neighbors = new ArrayList<>();
        int[] indegree = new int[numCourses];

        for(int i = 0; i < numCourses; i++){
            neighbors.add(new ArrayList<>());
        }

        for(int[] p : prerequisites){

            int target = p[0];
            int source = p[1];
            ArrayList<Integer> neigh = neighbors.get(source);
            neigh.add(target);
            indegree[target]++;
        }
    
        // find 0s and add to queue
        Deque<Integer> queue = new ArrayDeque<>();
        for(int i = 0; i < numCourses; i++){
            if(indegree[i] == 0){
                queue.offer(i);
            }
        }


        // iterate 
        while(!queue.isEmpty()){
            int curr = queue.poll();
            order[index] = curr;
            index++;
            for(int neigh : neighbors.get(curr)){
                if(--indegree[neigh] == 0){
                    queue.offer(neigh);
                }
            }
        }
            
        return index == numCourses ? order : new int[0];
    }
}