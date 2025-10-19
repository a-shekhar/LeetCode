class Solution {
    public int countTestedDevices(int[] batteryPercentages) {
        int testedDevice = 0;
        int n = batteryPercentages.length;
        for (int i = 0; i < n; i++){
            if(batteryPercentages[i] <= 0){
                continue;
            }
            for(int j = i + 1; j < n; j++){
                batteryPercentages[j]--;
            }
            testedDevice++;
        }
        return testedDevice;
    }
}