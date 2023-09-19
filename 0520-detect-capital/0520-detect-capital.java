class Solution {
        public boolean detectCapitalUse(String word) {
        String cap = word.toUpperCase();
        String lower = word.toLowerCase();
        if(cap.equals(word)){
           return true;
        }else if(lower.equals(word)){
            return true;
        }else{
            if(Character.isLowerCase(word.charAt(0))){
                return false;
            }else{
                boolean flag = true;
                for(int i = 1; i < word.length(); i++){
                    if(Character.isUpperCase(word.charAt(i))){
                        flag = false;
                        break;
                    }
                }
                if(flag){
                    return true;
                }
            }
        }
        return false;
    }

}