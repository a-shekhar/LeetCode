class Solution {
     private int setCount(int count, char[] chars, int index){ 
        if(count <= 1){
            return index;
        }
        String strVal = String.valueOf(count);
        for(int i = 0; i < strVal.length(); i++){
            chars[++index] = strVal.charAt(i);
        }
        return index;
    }

    public int compress(char[] chars) {
        char ch = chars[0];
        int count = 1;
        int index = 0;
        for(int i = 1; i < chars.length; i++){
            if(chars[i] == ch){
                count++;
            } else {
                index = setCount(count, chars, index);
                ch = chars[i];
                chars[++index] = ch;
                count = 1;
            }
        }

        index = setCount(count, chars, index);
        return index + 1;
    }
}