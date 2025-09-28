class Solution {
    public int convertTime(String current, String correct) {
         int n = 0;
        n = 60 * Integer.parseInt(correct.substring(0,2)) + Integer.parseInt(correct.substring(3));
        n -= 60 *  Integer.parseInt(current.substring(0,2)) + Integer.parseInt(current.substring(3));
        int step  =  0;
    
        while(n > 0){
            if(n >= 60){
                step += (n/60);
                n %= 60;
            }
            else if(n >= 15){
                step += (n/15);
                n %= 15;
            }else if(n >= 5){
                step += (n/5);
                n %= 5;
            } else {
                step += n;
                n = 0;
            }
        }
        return step;
    }
}