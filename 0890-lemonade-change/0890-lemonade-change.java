class Solution {
    public boolean lemonadeChange(int[] bills) {
        int five = 0 , ten = 0, twenty = 0;
        for(int bill : bills){
            switch (bill) {
                case 5:
                    five++;
                    break;
                case 10:
                    if (five < 1) {
                        return false;
                    }
                    ten++;
                    five--;
                    break;
                default:
                    if(ten > 0){
                        if (five < 1) {
                            return false;
                        }
                        ten--;
                        five--;
                    }else{
                        if (five < 3) {
                            return false;
                        }
                        five -= 3;
                    }
                    break;
            }
        }
        return true;
    }
}