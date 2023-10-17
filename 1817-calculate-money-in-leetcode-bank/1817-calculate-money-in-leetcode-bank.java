class Solution {
    public int totalMoney(int n) {
        int totalMoney = 0;
        int start = 0;
        int money = 0;
        int i = 0;
        while (i < n){
            if(i % 7 == 0){
                start++;
                money = start;
            }else{
                money++;
            }
            totalMoney += money;
            i++;
        }
        return totalMoney;
    }

}