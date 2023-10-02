import java.math.BigInteger;

class Solution {
    public int numDifferentIntegers(String word) {
        String num = "";
        Set<BigInteger> set = new HashSet<>();
        for(int i=0; i< word.length(); i++){
            if(Character.isDigit(word.charAt(i))){
                num += String.valueOf(word.charAt(i));
               
            }else{
                if(!num.isEmpty()){
                    set.add(new BigInteger(num));
                }
                num = "";
            }
        }
        // add the last num
        if(!num.isEmpty()){
            set.add(new BigInteger(num));
        }
        return set.size();
    }

}