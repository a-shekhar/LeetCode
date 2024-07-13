class Solution {
    public boolean isValid(String word) {
        if(word.length() < 3){
            return false;
        }
        String vowels = "aeiouAEIOU";
        int charCount = 0;
        int vowelCount = 0;
        for(char ch : word.toCharArray()){
            if(!Character.isDigit(ch) && !Character.isAlphabetic(ch)){
                return false;
            }
            if(Character.isAlphabetic(ch)){
                charCount++;
                if(vowels.contains(String.valueOf(ch))){
                    vowelCount++;
                }
            }
        }
        // it does not contain consonants
        if(vowelCount == charCount){
            return false;
        }
        // it does not contain vowles
        if(vowelCount == 0){
            return false;
        }
        return true;
    }
}