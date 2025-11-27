class Solution {
    public int maxCoins(int[] piles) {
        int maxCoins = 0;
        int i = piles.length / 3;
        Arrays.sort(piles);
        while(i < piles.length){
            maxCoins += piles[i];
            i += 2;
        }
        return maxCoins;
    }
}