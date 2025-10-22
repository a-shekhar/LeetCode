class Solution {
     private int setCount(int count, char[] chars, int index){
        if(count > 1 && count < 10){
            chars[++index] = (char) ('0' + count);
        }
        else if(count >= 10){
            StringBuilder builder = new StringBuilder();
            while(count > 0){
                builder.append(count % 10);
                count /= 10;
            }

            for(int j = builder.length() - 1;  j >=0 ; j--){
                chars[++index] = builder.charAt(j);
            }
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