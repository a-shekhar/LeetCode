class Solution {
    public int maxContainers(int n, int w, int maxWeight) {
        int containers = n * n;
        int currWeight = 0;
        int occupiedContainer = 0;
        while(occupiedContainer < containers){
            if(currWeight + w <= maxWeight) {
                currWeight += w;
                occupiedContainer++;
            }else{
                return occupiedContainer;
            }

        }
        return occupiedContainer;
    }
}