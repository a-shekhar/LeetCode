class Solution {
    public String removeStars(String s) {
        StringBuilder sb = new StringBuilder();
        Stack<Character> st = new Stack<>();

        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '*'){
                st.pop();
            }else{
                st.push(s.charAt(i));
            }
        
        }

        while(!st.isEmpty()){
            sb.insert(0, st.pop());
        }
        
        return sb.toString();
    }
}