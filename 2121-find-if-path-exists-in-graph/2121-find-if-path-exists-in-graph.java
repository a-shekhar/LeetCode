class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        List<List<Integer>> adjList = new ArrayList<>();

        for(int i =0;  i < n; i++){
            adjList.add(new ArrayList<>());
        }

        Set<Integer> visited = new HashSet<>();
        visited.add(source);

        // undirected graph
        for(int[] edge : edges){
            adjList.get(edge[0]).add(edge[1]);
            adjList.get(edge[1]).add(edge[0]);
        }

        System.out.println("Aditya");

        System.out.println(adjList);

        return dfs(source, destination, adjList, visited);
        
    }

    private boolean dfs(int source, int destination, List<List<Integer>> adjList, Set<Integer> visited) {
        if(source == destination){
            return true;
        }

        
        for(int neigh : adjList.get(source)){
            if(!visited.contains(neigh)){
                visited.add(neigh);
             if(dfs(neigh, destination, adjList, visited)){
                return true;
             }
            }
        }

        return false;

    }
}