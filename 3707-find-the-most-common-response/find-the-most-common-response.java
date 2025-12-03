class Solution {
    public String findCommonResponse(List<List<String>> responses) {
        Map<String, Integer> map = new HashMap<>();
        for(List<String> response : responses){
            Set<String> set = new HashSet<>(); 
            for(String word : response){
                set.add(word);
            }
            for(String word : set){
                map.put(word, map.getOrDefault(word, 0) + 1);
            }
        }

        return map.entrySet().stream()
        .sorted(Comparator.comparing(Map.Entry<String, Integer>::getValue)
                  .reversed()
                  .thenComparing(Map.Entry::getKey)).findFirst().get().getKey();
    }
}