class Solution {
     public int countTime(String time) {
        int count = 1;
        if(time.charAt(0) == '?') {
            if (time.charAt(1) != '?' && Character.getNumericValue(time.charAt(1)) >= 4) {
                count *= 2;
            } else if(time.charAt(1) == '?') {
                count *= 24;
            } else{
                count *= 3;
            }
        }

        if(time.charAt(1) == '?'){
            if(time.charAt(0) != '?' && Character.getNumericValue(time.charAt(0)) == 2){
                count *= 4;
            }else if(time.charAt(0) != '?'){
                count *= 10;
            }
        }

        if(time.charAt(3) == '?'){
            count *= 6;
        }

        if(time.charAt(4) == '?'){
            count *= 10;
        }

        return count;
    }
}