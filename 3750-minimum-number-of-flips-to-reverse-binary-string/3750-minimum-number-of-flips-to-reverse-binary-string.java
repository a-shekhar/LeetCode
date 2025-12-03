class Solution {
    public int minimumFlips(int n) {
        StringBuilder builder = new StringBuilder();
       while(n > 0){
            builder.append(n % 2);
            n /= 2;
       } 
       int len = builder.length();
       int count = 0;
       for(int i = 0; i < len/2; i++){
            if(builder.charAt(i) != builder.charAt(len-i-1)){
                count+=2;
            }
       }

       return count;
    }
}