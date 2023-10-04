class Solution {
    public boolean checkOnesSegment(String s) {
        boolean hasOne = false;
        boolean hasZerosInBetween = false;
 
        for(int i=0; i <s.length(); i++){
            if(!hasOne && s.charAt(i) == '1'){
                hasOne = true;
            }
            if(hasOne && !hasZerosInBetween && s.charAt(i) == '0'){
                hasZerosInBetween = true;
            }

            if(hasZerosInBetween && s.charAt(i) == '1'){
                return false;
            }
        }
        return true;
    }
}