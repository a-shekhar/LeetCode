class Solution {
    public int secondHighest(String s) {
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i < s.length(); i++){
            if(Character.isDigit(s.charAt(i))){
                set.add(Character.getNumericValue(s.charAt(i)));
            }
        }
        
        if(set.size() <= 1){
            return -1;
        }
        List<Integer> list = new ArrayList<>(set);
        Collections.sort(list);
        return list.get(list.size()-2);
    }
}