class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        Arrays.sort(capacity);
        int totalSum = 0;
        for(int app : apple){
            totalSum += app;
        }

        int count = 0;
        int sum = 0;
        for(int j = capacity.length -1; j >= 0; j--){
            sum += capacity[j];
            count++;
            if(sum >= totalSum){
                return count;
            }
        }
        return count;
    }
}