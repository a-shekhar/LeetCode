class Solution {
    public String toGoatLatin(String sentence) {
        String vowel = "aeiouAEIOU";
        String[] words = sentence.split(" ");
        int i = 0;
        for(String word: words){
            if(vowel.contains(String.valueOf(word.charAt(0)))){
                words[i] = word + "ma" + ("a".repeat(i+1));
            }else{
                words[i] = word.substring(1) + word.substring(0, 1)
                        + "ma" + ("a".repeat(i+1));
            }
            i++;
        }
        return String.join(" ", words);
    }
}