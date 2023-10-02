class Solution {
    public boolean checkAlmostEquivalent(String word1, String word2) {
        Map<Character, Integer> map1 = new TreeMap<>();
        Map<Character, Integer> map2 = new TreeMap<>();
        for(int i = 0; i < word1.length(); i++){
            map1.putIfAbsent(word1.charAt(i), 0);
            map1.put(word1.charAt(i), map1.get(word1.charAt(i)) + 1);
        }

        for(int i = 0; i < word2.length(); i++){
            map2.putIfAbsent(word2.charAt(i), 0);
            map2.put(word2.charAt(i), map2.get(word2.charAt(i)) + 1);
        }
        
        int temp = 0;
        for(Map.Entry<Character, Integer> entry : map1.entrySet()){
            temp = 0;
            if(map2.containsKey(entry.getKey())){
                temp = map2.get(entry.getKey());
                map2.remove(entry.getKey());
            }
            if(Math.abs(entry.getValue() - temp) > 3){
                return false;
            }
        }

        for(Map.Entry<Character, Integer> entry : map2.entrySet()){
            if(entry.getValue() > 3){
                return false;
            }
        }

        return true;
    }

}