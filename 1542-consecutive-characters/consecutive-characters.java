class Solution {
    public int maxPower(String s) {
        if(s.length() == 1){
            return s.length();
        }
       int count = 1;
       int power = 0;
       for(int i=0; i<s.length()-1; i++){
           if(s.charAt(i) == s.charAt(i+1)){
               count++;
           }else{
               count = 1;
           }
           power = Math.max(count, power);
       }
       return power;
    }
}