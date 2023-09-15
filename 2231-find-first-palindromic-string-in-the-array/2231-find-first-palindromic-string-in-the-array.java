class Solution {
    public String firstPalindrome(String[] words) {
        for(String word : words){
            if(word.equals(palindrome(word))){
                return word;
            }
        }
        return "";
    }

    private String palindrome(String word){
        String reverse = "";
        for(int j = word.length()- 1; j >=0; j--){
            reverse += word.charAt(j);
        }
    
        return reverse;
    }
}