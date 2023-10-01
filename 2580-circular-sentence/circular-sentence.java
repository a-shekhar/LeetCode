class Solution {
     public boolean isCircularSentence(String sentence) {
        String[] words = sentence.split(" ");
        String lastWord = words[words.length-1];
        String firstWord = words[0];
        if(firstWord.charAt(0) != lastWord.charAt(lastWord.length()-1)){
            return false;
        }
        for(int i = 0; i < words.length-1; i++){
            if(words[i].charAt(words[i].length()-1) != words[i+1].charAt(0)){
                return false;
            }
        }
        return true;
    }
}