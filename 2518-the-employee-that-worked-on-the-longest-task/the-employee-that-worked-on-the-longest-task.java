class Solution {
    public int hardestWorker(int n, int[][] logs) {
        int id = 0;
        int leaveTime = 0;
        int maxLeaveTime = -1;
        int time = 0;
        for(int[] log : logs){
            time = log[1] - leaveTime;
            if(time >= maxLeaveTime){
                if(time == maxLeaveTime){
                    id = Math.min(id, log[0]);
                }else{
                    id = log[0];
                }
                maxLeaveTime = time;
            }
            leaveTime = log[1];
        }
        return id;
    }
}