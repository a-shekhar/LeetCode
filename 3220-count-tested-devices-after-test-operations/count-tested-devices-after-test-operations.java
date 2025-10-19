class Solution {
    public int countTestedDevices(int[] batteryPercentages) {
        int testedDevice = 0;
        
        for (int battery : batteryPercentages){
            if(battery - testedDevice > 0){ // since eventually it should decrement everytime one battery has been tested
                testedDevice++;
            }
        }
        return testedDevice;
    }
}