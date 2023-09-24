class Solution {
    public String makeFancyString(String s) {
        Stack<Character> st = new Stack<>();
        StringBuilder builder = new StringBuilder();
        int count = 0;
        for(int i =0; i<s.length();i++){
            if(!st.isEmpty() && st.peek() == s.charAt(i)){
                st.push(s.charAt(i));
                count++;
            }else{
                st.push(s.charAt(i));
                count = 1;
            }
            if(count == 3){
                st.pop();
                count--;
            }
        }
        while (!st.isEmpty()){
            builder.insert(0, st.pop());
        }
        return builder.toString();
    }
}
