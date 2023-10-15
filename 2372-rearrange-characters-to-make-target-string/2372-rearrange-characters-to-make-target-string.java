class Solution {
    public int rearrangeCharacters(String s, String target) {
        int count = 0;
        Map<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }
        boolean found;
        while (true){
            found = true;
            for(int i = 0; i < target.length(); i++) {
                if (!map.containsKey(target.charAt(i)) || map.get(target.charAt(i)) == 0) {
                    found = false;
                    break;
                }
                map.put(target.charAt(i), map.get(target.charAt(i)) - 1);
            }
            if(found){
                count++;
            }else {
                break;
            }
        }
        return count;
    }
}