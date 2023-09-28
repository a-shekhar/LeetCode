class Solution {
    public boolean makeEqual(String[] words) {
        HashMap<Character, Integer> map = new HashMap<>();
        char ch;
        for(String word : words){
            for(int i = 0; i < word.length(); i++){
                ch = word.charAt(i);
                map.putIfAbsent(ch, 0);
                map.put(ch, map.get(ch) + 1);
            }
        }

        List<Integer> values = new ArrayList<>(map.values());
        for(int val : values){
            if(val % words.length != 0){
                return false;
            }
        }
        return true;
    }
}