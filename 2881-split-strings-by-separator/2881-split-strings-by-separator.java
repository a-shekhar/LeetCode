class Solution {
    public List<String> splitWordsBySeparator(List<String> words, char separator) {
        List<String> list = new ArrayList<>();
        for(int i=0; i < words.size(); i++){
            System.out.print( words.get(i));
            String[]  arr = words.get(i).split(String.valueOf("\\" + separator));
            for(String word : arr){
                if(word.length() > 0){
                    list.add(word);
                }
            } 
        }
        return list;
    }
}