class Solution {
    public boolean areOccurrencesEqual(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int val;
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i< s.length(); i++){
            map.putIfAbsent(s.charAt(i), 0);
            val = map.get(s.charAt(i))+ 1;
            list.remove(Integer.valueOf(val));
            map.put(s.charAt(i), val);
            list.add(val+1);
        }
      
        Set<Integer> set = new HashSet<>();
        set.addAll(list);
        return set.size() == 1;
    }
}