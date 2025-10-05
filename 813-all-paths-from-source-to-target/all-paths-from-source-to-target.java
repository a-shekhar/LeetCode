class Solution {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> path = new ArrayList<>();

        path.add(0);
        findpaths(0, graph, path, result);

        return result;
    }

    private void findpaths(int source, int[][] graph, List<Integer> path, List<List<Integer>> result) {
        int dest = graph.length - 1;
        if(source == dest){
            result.add(new ArrayList<>(path));
            return;
        }


        for(int neigh : graph[source]){
            path.add(neigh);
            findpaths(neigh, graph, path, result);
            // backtrack it 
            path.remove(path.size()-1);
        }

    }
}