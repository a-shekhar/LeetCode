class Solution {
    public int reverse(int x) {
        int maxInt = ((int) Math.pow(2, 31) -1)/10;
        int minInt = ((int) Math.pow(-2, 31))/10;
        System.out.println(maxInt);
        int reverse = 0;
        int rem = 0;
        boolean isNegative =  x < 0 ? true : false;
        if(isNegative){
            x *= -1;
        }
        while(x > 0){
            rem = x % 10;
           
            if(reverse > maxInt || reverse < minInt){
                return 0;
            }
            reverse = (reverse * 10) + rem;
           
            x = x / 10;
        }
        if(isNegative){
            reverse *= -1;
        }
        return reverse; 
    }
}