class Solution {
    public int totalMoney(int n) {
        int totalMoney = 0;
        int initialDeposit = 0;
        int money = 0;
        for(int i = 1; i <= n; i++){
            if(i % 7 == 1){
                initialDeposit++;
                money = initialDeposit;
                totalMoney += money;
            } else {
                money++;
                totalMoney += money;
            }
        }

        return totalMoney;
    }
}