class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        List<Integer> indexList = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();
        List<String> wordList = new ArrayList<>();

        for(String word : list1){
            wordList.add(word);
        }

        for(int i = 0; i < list2.length; i++){
            if(wordList.contains(list2[i])){
                int temp = i + wordList.indexOf(list2[i]);
                map.put(list2[i], temp);
                indexList.add(temp);
            }
        }

        Collections.sort(indexList);
        int minVal = indexList.get(0);
        List<String> ans = new ArrayList<>();
        for(Map.Entry<String, Integer> entry: map.entrySet()){
            if(entry.getValue() == minVal){
                ans.add(entry.getKey());
            }
        }
        return ans.stream().toArray(String[] ::new);
    }
}