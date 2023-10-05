class Solution {
    public int hammingDistance(int x, int y) {
         int distance = 0;
         int rem1, rem2;
         while(x > 0 || y > 0){
             rem1 =  x == 0 ? 0 : x % 2;
             rem2 =  y == 0 ? 0 : y % 2;
             if(rem1 != rem2){
                 distance++;
             }
             x /= 2;
             y /= 2;
         }
         return distance;
    }
}