class Solution {
    public int distanceBetweenBusStops(int[] distance, int start, int destination) {
        int pathSum = 0;
        for(int num : distance){
            pathSum += num;
        }
        int sum = 0;
        if(start > destination){
            int temp = start;
            start = destination;
            destination = temp;
        }
        for(int i = start; i < destination; i++){
            sum += distance[i];
        }
        return Math.min(sum, pathSum-sum);
    }
}