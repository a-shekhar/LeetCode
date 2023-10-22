class Solution {
    public int countCharacters(String[] words, String chars) {
        Map<Character, Integer> map = new HashMap<>();
        for(int i= 0; i < chars.length(); i++){
            map.put(chars.charAt(i), map.getOrDefault(chars.charAt(i), 0) + 1);
        }
        Map<Character, Integer> clonedMap;
        boolean isFound;
        int count = 0;
        for(String word : words){
            clonedMap = new HashMap<>(map);
            isFound = true;
            for(int i= 0; i < word.length(); i++){
                if(!clonedMap.containsKey(word.charAt(i)) || clonedMap.get(word.charAt(i)) == 0){
                    isFound = false;
                    break;
                }else{
                    clonedMap.put(word.charAt(i), clonedMap.getOrDefault(word.charAt(i), 0) - 1);
                }
            }

            if(isFound){
                count += word.length();
            }
        }
        return count;
    }
}