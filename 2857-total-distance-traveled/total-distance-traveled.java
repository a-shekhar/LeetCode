class Solution {
    public int distanceTraveled(int mainTank, int additionalTank) {
        if(mainTank < 5 ){
            return mainTank * 10;
        }
        int distance = 0;
        int rem = mainTank;
        int add = 0;
        while(additionalTank > 0 && mainTank >= 5){
            rem = mainTank % 5;
            int n = Math.min(mainTank/5, additionalTank);
            distance +=  10 * (mainTank - rem);
            additionalTank -= n;
            mainTank = rem + n;
        }
    
        return distance+ (mainTank * 10);
    }
}