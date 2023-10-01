class Solution {
    public int firstUniqChar(String s) {
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
        for(int i = 0;  i<s.length(); i++){
            map.putIfAbsent(s.charAt(i), 0);
            map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
        }
        char  ch = '\0';
       
        for(Map.Entry<Character, Integer> entry: map.entrySet()){
            if(entry.getValue() == 1){
                ch = entry.getKey();
                break;
            }
        }
     
        return s.indexOf(ch);
    }

}