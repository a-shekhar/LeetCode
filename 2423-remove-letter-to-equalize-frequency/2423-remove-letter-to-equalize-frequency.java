class Solution {
    
    boolean checkEqual(Map<Character, Integer> map){
        Set<Integer> set = new HashSet<>(map.values());
        set.remove(0);
        //System.out.println(set);
        return set.size() <= 1; 
    }

    public boolean equalFrequency(String word) {
        Map<Character, Integer> map = new HashMap<>();
        for(Character ch : word.toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        // remove frequencies
         for(Character ch : word.toCharArray()){
            int freq = map.get(ch);
            map.put(ch, freq - 1);
            if(checkEqual(map)) return true;
            map.put(ch, freq);
        }
        return false;
    }
   
}