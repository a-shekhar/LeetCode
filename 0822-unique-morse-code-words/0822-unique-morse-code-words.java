class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String[] morse = new String[]{".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."
        };
        Set<String> set = new HashSet<>();
        for(String word : words){
            String builder = "";
            for(int i =0; i < word.length(); i++){
                builder += (morse[word.charAt(i) - 97]);
            }
            set.add(builder);
        }
        return set.size();
    }
}