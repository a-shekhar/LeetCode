class Solution {
     public String gcdOfStrings(String str1, String str2) {
        if(str1.equals(str2)){
            return str1;
        }

       
        int gcd = gcd(str1.length(), str2.length());

         if(!str1.substring(0, gcd).equals(str2.substring(0, gcd))){
            return "";
        }

        if(!str1.substring(0, gcd).repeat(str1.length()/gcd).equals(str1)){
            return "";
        }

        if(!str2.substring(0, gcd).repeat(str2.length()/gcd).equals(str2)){
            return "";
        }
        
        return str1.substring(0, gcd);
    }



    private int gcd(int n1, int n2){
        if(n2 == 0){
            return n1;
        }
        return gcd(n2, Math.abs(n1 - n2));
    }
}