class Solution {
     public String oddString(String[] words) {
        HashMap<List<Integer>, Integer>map = new HashMap<>(0);
        HashMap<List<Integer>, String> map2 = new HashMap<>(0);
        List<Integer> list;
        for (String word : words) {
            list = new ArrayList<>();
            for (int j = 1; j < word.length(); j++) {
                list.add((int) word.charAt(j) - (int) word.charAt(j - 1));
            }
            map.put(list, map.getOrDefault(list, 0) + 1);
            map2.put(list, word);
        }
        
        List<Integer>temp = new ArrayList<>();
        for(Map.Entry<List<Integer>, Integer> entry : map.entrySet()){
           if(entry.getValue() == 1){
               temp = entry.getKey();
               break;
           }
        }

        return map2.get(temp);
    }
}