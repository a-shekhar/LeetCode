class Solution {
    public String capitalizeTitle(String title) {
        StringBuilder  ans = new StringBuilder();
        String[] words = title.split(" ");
        for(String word : words){
            if(word.length() <= 2){
                word = word.toLowerCase();
            }else{
                word = Character.toUpperCase(word.charAt(0)) + word.substring(1).toLowerCase();
            }
            ans.append(word + " ");
        }
        return ans.toString().trim();
    }
}