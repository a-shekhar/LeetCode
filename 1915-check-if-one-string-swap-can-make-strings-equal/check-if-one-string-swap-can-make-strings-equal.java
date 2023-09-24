class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        if(s1.equals(s2)){
            return true;
        }

        if(s1.length() != s2.length()){
            return false;
        }

        int count = 0;
        char ch1 = '-'; 
        char ch2 = '-';// just to hold first different chars

        for(int i=0; i<s1.length(); i++){
            if(s1.charAt(i) != s2.charAt(i)){
                if(count == 0){
                    ch1 = s1.charAt(i);
                    ch2 = s2.charAt(i);
                }else{
                    if(s2.charAt(i) != ch1 || s1.charAt(i) != ch2){ // just to make sure swap works
                        return false;
                    }
                }
                count++;
                if(count > 2){
                    return false;
                }
            }
        }
        
        return count == 2;
    }
}