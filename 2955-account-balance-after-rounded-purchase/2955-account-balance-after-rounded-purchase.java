class Solution {
    public int accountBalanceAfterPurchase(int purchaseAmount) {
        int div = purchaseAmount / 10;
        int rem = purchaseAmount % 10;
        if(rem >= 5){
            return 100 - (10 * (div+1));
        }
        return 100-(10*div);
    }
}