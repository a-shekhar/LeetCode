class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int timeTaken = 0;
        int lastPoison = 0;
        for(int time : timeSeries){
            if(lastPoison <= time){
                timeTaken += duration;
            }else{
                timeTaken += (time + duration - lastPoison);
            }
            lastPoison = time + duration;
        }
        return timeTaken;
    }
}