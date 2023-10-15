class Solution {
    public String maximumTime(String time) {
        String latestTime = "";
        if(time.charAt(0) == '?') {
                if(time.charAt(1) != '?' && Character.getNumericValue(time.charAt(1)) > 3){
                    latestTime += '1';
                }else{
                    latestTime += '2';
                }
        }else{
            latestTime += time.charAt(0);
        }
        
        latestTime += time.charAt(1) == '?' ? (latestTime.charAt(0) == '2' ? '3' : '9') : time.charAt(1);
        latestTime += ":";
        latestTime += time.charAt(3)  == '?' ? '5' : time.charAt(3);
        latestTime += time.charAt(4)  == '?' ? '9' : time.charAt(4);
        return latestTime;

    }


}