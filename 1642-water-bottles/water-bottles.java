class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int canDrink = numBottles;
        int empty = numBottles;
        while (true){
            if(empty < numExchange){
                break;
            }else{
                int temp = empty/numExchange;
                canDrink += temp;
                empty = (empty % numExchange) + temp;
            }
        }
        return canDrink;
    }
}