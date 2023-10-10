class Solution {
    public int maximumPopulation(int[][] logs) {
        int arr[] = new int[101];
        int temp = 0;
        int max = 0;
        for(int[] log : logs){
            for(int year = log[0]; year < log[1]; year++){
                arr[year-1950]++;
                max = Math.max(max, arr[year-1950]);
            }
        }
    
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == max){
                return i  +  1950;
            }
        }
        
        return 0;
    }
}