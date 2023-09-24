class Solution {
    public int countWords(String[] words1, String[] words2) {
        Set<String> set1 = new HashSet<>();
        Set<String> set2 = new HashSet<>();
        Set<String> set = new HashSet<>();
        for(String word : words1){
            if(set1.contains(word)){
                set.add(word);
            }else{
                set1.add(word);
            }
        }

        set1.removeAll(set);
        set = new HashSet<>();
        for(String word : words2){
            if(set2.contains(word)){
                set.add(word);
            }else{
                set2.add(word);
            }
        }
        set2.removeAll(set);
        set1.retainAll(set2);
        return set1.size();
    }
}
