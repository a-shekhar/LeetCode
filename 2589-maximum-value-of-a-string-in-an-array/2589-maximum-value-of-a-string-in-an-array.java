class Solution {
    public int maximumValue(String[] strs) {
        boolean hasDigit = false;
        boolean hasChars = false;
        int maxVal = -1;
        int temp = 0;
        for(String word : strs){
            hasDigit = false;
            hasChars = false;
            for(int i= 0; i  < word.length(); i++){
                if(!hasDigit && Character.isDigit(word.charAt(i))){
                    hasDigit = true;
                } else if (!hasChars && Character.isAlphabetic(word.charAt(i))) {
                    hasChars = true;
                }

                if(hasChars && hasDigit){
                    break;
                }
            }

            if(!hasChars && hasDigit){
                temp = Integer.parseInt(word);
            }else{
                temp = word.length();
            }
            maxVal = Math.max(temp, maxVal);
        }
        return maxVal;
    }
}