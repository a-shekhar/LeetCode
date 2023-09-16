class Solution {
    public int countPoints(String rings) {
        Map<Integer, Set<Character>> map = new HashMap<>();
        int index = 0;
        int rod = 0;
        Set<Character> set;
        int count = 0;

        for(int i = 0; i < rings.length(); i = i+2){
            index = Character.getNumericValue(rings.charAt(i+1));
            map.putIfAbsent(index, new HashSet<>());
            set = map.get(index);
            set.add(rings.charAt(i));
            map.put(index, set);
        } 
        for(Set<Character> st : map.values()){
            if(st.size() == 3){
                count++;
            }
        }
        return count;
    }
}