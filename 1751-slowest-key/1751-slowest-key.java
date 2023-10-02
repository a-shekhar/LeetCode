class Solution {
    public char slowestKey(int[] releaseTimes, String keysPressed) {
        Map<Character, Integer> map = new TreeMap<>();
        int startTime = 0;
        int temp;
        for(int i=0; i<releaseTimes.length; i++){
            if(!map.containsKey(keysPressed.charAt(i))){
                map.put(keysPressed.charAt(i), releaseTimes[i] - startTime);
            }else{
                temp =  releaseTimes[i] - startTime > map.get(keysPressed.charAt(i))
                        ? releaseTimes[i] -startTime : map.get(keysPressed.charAt(i));
                map.put(keysPressed.charAt(i), temp);
            }
            startTime = releaseTimes[i];
           
        }
        int longestDuration = 0;
        char ch = '\0';
        
        for(Map.Entry<Character, Integer> entry : map.entrySet()){
            if(entry.getValue() > longestDuration) {
                ch = entry.getKey();
                longestDuration = entry.getValue();
            } else if (entry.getValue() == longestDuration) {
                ch = entry.getKey() > ch ? entry.getKey() : ch;
            }
        }
        return ch;
    }
}