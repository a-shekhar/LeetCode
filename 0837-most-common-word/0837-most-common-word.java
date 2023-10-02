class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        paragraph = paragraph.replace('!', ' ').replace('?', ' ')
                .replace('\'', ' ').replace(',', ' ')
                .replace(';', ' ').replace('.', ' ').toLowerCase();
        String[] words = paragraph.split("\\s+");
       
        Map<String, Integer> map = new HashMap<>();
        List<String> bannedList = Arrays.asList(banned);
        
        for(String word : words){
            if(!bannedList.contains(word)){
                map.putIfAbsent(word, 0);
                map.put(word, map.get(word) + 1);
            }
        }
        String frequentWord = "";
        int frequent = 0;
        for(Map.Entry<String , Integer> entry : map.entrySet()){
            if(entry.getValue() > frequent){
                frequent = entry.getValue();
                frequentWord = entry.getKey();
            }
        }
        return frequentWord;
    }
}