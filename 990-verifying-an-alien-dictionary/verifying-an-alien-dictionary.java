class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        Map<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < order.length(); i++){
            map.put(order.charAt(i), i);
        }
        map.put(' ', -1);
        for(int i = 0; i < words.length-1; i++){
            int len1 = 0;
            for(int j = i+1; j < words.length; j++){
                int len2 = 0;
                boolean sorted = true;
                while(len1 < words[i].length() || len2 < words[j].length()){
                    char ch1= len1 < words[i].length()  ? words[i].charAt(len1) : ' ';
                    char ch2= len2 < words[j].length()  ? words[j].charAt(len2) : ' ';
                 
                    if(map.get(ch1) < map.get(ch2)){
                        break;
                    }
                    if(map.get(ch1) > map.get(ch2)){
                        return false;
                    }
                    len1++;
                    len2++;
                }
            }
        }
        return true;
    }
}