class Solution {
    private int calculate(int[] piles, int k){
        int totalHours = 0;
        for(int pile : piles){
            totalHours += Math.ceil((double) pile / k);
        }
        return totalHours;
    }

    public int minEatingSpeed(int[] piles, int h) {
        int maxElement = Arrays.stream(piles).max().getAsInt();
        int low = 0;
        int high = maxElement;
        int mid;

        while(low <= high){
            mid = low + (high - low) / 2;

            int hours = calculate(piles, mid);
                        
            if(hours > h){
                low = mid + 1;
            } else{
                high = mid -1;
            }
        }

        return low;
    }
}