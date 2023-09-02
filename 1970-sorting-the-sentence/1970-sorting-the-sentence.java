class Solution {
    public String sortSentence(String s) {
        String[] words = s.split(" ");
        String[] res = new String[words.length];
        int i = 0;
        for(String word: words){
            i = Integer.parseInt(String.valueOf(word.charAt(word.length() -1)));
            res[i-1] = word.substring(0, word.length() -1);
        }
        return String.join(" ", res);
    }
}