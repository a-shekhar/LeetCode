class Solution {
    public String reversePrefix(String word, char ch) {
        if(!word.contains(String.valueOf(ch))){
            return word;
        }
        Stack<Character>st= new Stack<>();
        int i = 0;
        while(i < word.length()){
            st.push(word.charAt(i));
            if(word.charAt(i) == ch){
                break;
            }
            i++;
        }

        StringBuilder str  = new StringBuilder();
        while(!st.isEmpty()){
            str.append(st.pop());
        }
        if(str.length() != word.length()){
            str.append(word.substring(i+1));
        }
        return str.toString();
    }
}