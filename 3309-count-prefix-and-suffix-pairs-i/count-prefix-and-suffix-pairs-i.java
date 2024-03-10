class Solution {
    public int countPrefixSuffixPairs(String[] words) {
        int count = 0;
       for(int i = 0; i < words.length - 1; i++){
           for(int j = i+1; j < words.length; j++){
               if(isPrefixAndSuffix(words[i], words[j])){
                   count++;
               }
           }
        } 
        return count;
    }

    private boolean isPrefixAndSuffix(String word1, String word2){
        if(word2.startsWith(word1) && word2.endsWith(word1)){
            return true;
        }
        return false;
    }
}