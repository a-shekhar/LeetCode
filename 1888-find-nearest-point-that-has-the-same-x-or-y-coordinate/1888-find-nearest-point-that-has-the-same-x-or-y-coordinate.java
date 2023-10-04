class Solution {
    public int nearestValidPoint(int x, int y, int[][] points) {
        int minDistance = Integer.MAX_VALUE;
        int distance;
        Map<Integer, Integer> map = new TreeMap<>();
        
        for(int i = 0; i < points.length; i++){
            
            if(points[i][0] == x || points[i][1] == y){
                distance = Math.abs(x-points[i][0]) + Math.abs(y-points[i][1]);
                minDistance = Math.min(distance, minDistance);
                map.put(i, distance);
            }
        }
        
        for (Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(entry.getValue() == minDistance){
                return entry.getKey();
            }
        }
        return  -1;
    }
}