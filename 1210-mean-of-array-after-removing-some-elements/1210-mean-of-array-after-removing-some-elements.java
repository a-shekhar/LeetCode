class Solution {
    public double trimMean(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;
        int temp = n/20;
        
        int sum = 0;
        for(int i = temp; i < n-temp; i++){
            sum += arr[i];
        }
       
        return (double) sum / (n - (2 * temp));
    }
}