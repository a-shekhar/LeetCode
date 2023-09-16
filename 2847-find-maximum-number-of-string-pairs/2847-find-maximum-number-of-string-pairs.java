class Solution {
    public int maximumNumberOfStringPairs(String[] words) {
        int count = 0;
        StringBuilder word1;
        StringBuilder word2;

        for(int i = 0; i < words.length-1; i++){
            word1 = new StringBuilder(words[i]);
            for(int j = i+1; j < words.length; j++){
                word2 = new StringBuilder(words[j]);
                if(word1.toString().equals(word2.reverse().toString())){
                    count++;
                }
            }
        }
        return count;
    }
}