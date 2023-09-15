class Solution {
    public boolean areOccurrencesEqual(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for(int i = 0; i< s.length(); i++){
            map.putIfAbsent(s.charAt(i), 0);
            map.put(s.charAt(i), map.get(s.charAt(i))+ 1);
        }
      
        Set<Integer> set = new HashSet<>();
        set.addAll(map.values());
        return set.size() == 1;
    }
}