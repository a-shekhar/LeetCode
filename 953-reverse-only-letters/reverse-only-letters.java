class Solution {
    public String reverseOnlyLetters(String str) {
        if(str.length() == 0){
            return "";
        }
        if(str.length() == 1){
            return str;
        }
        int i = 0;
        int j = str.length() - 1;
        char[] charArray = str.toCharArray();
        while (i < j){
            char ci = charArray[i];
            char cj = charArray[j];
            if(!Character.isAlphabetic(ci)){
                i++;
                continue;
            }
            if(!Character.isAlphabetic(cj)){
                j--;
                continue;
            }
            if(Character.isAlphabetic(ci) && Character.isAlphabetic(cj)){
                char tmp = ci;
                charArray[i] = cj;
                charArray[j] = tmp;
                i++;
                j--;
            }
        }
       StringBuilder sb = new StringBuilder();
        for(char c : charArray){
            sb.append(c);
        }
        return sb.toString();

    }
}