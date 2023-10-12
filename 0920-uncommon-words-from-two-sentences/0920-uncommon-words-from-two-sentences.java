class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
            HashMap<String, Integer> map1 = new HashMap<>();
            HashMap<String, Integer> map2 = new HashMap<>();

            String[] words = s1.split(" ");
            for(String word : words){
                map1.put(word, map1.getOrDefault(word, 0) + 1);
            }

            words = s2.split(" ");
            for(String word : words){
                map2.put(word, map2.getOrDefault(word, 0) + 1);
            }

            List<String> list = new ArrayList<>();
            for(Map.Entry<String, Integer> entry : map1.entrySet()){
                if(entry.getValue() == 1 && !map2.containsKey(entry.getKey())){
                    list.add(entry.getKey());
                }
            }

            for(Map.Entry<String, Integer> entry : map2.entrySet()){
                if(entry.getValue() == 1 && !map1.containsKey(entry.getKey())){
                    list.add(entry.getKey());
                }
            }
            
            return list.toArray(new String[0]);
        }

}