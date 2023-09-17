class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        String[] words = text.split(" ");
        boolean flag = true;
        int count = 0;
        for(String word : words){
            flag = true;
            for(int i=0; i< word.length(); i++){
                if(brokenLetters.contains(String.valueOf(word.charAt(i)))){
                    flag = false;
                    break;
                }
            }
        
            if(flag){
                count++;
            }
        }
        return count;
    }
}