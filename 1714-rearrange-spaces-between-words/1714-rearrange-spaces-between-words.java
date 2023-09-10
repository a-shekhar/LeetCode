class Solution {
    public String reorderSpaces(String text) {
            int totalSpace = 0;
            StringBuilder builder = new StringBuilder();
            int space = 0;
            int spaceAtEnd = 0;
            String[] words = text.trim().split("\\s+");
            for(char character: text.toCharArray()){
                if(character == ' '){
                    totalSpace++;
                }
            }
            if(words.length > 1){
                space = totalSpace / (words.length-1);
                spaceAtEnd = totalSpace % (words.length-1);
            }else{
                spaceAtEnd = totalSpace;
            }
            String spaceInserted = " ".repeat(space);
            String spaceInsertedAtEnd = " ".repeat(spaceAtEnd);
            String finalString = String.join(spaceInserted, words);
            return finalString + spaceInsertedAtEnd;
        }
}