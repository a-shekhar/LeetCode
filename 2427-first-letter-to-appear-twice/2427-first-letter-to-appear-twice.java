class Solution {
    public char repeatedCharacter(String s) {
        Set<Character> st = new HashSet<>();
        for(int i= 0; i<s.length(); i++){
            if(st.contains(s.charAt(i))){
                return s.charAt(i);
            }else{
                st.add(s.charAt(i));
            }
        }
        return 'a';
    }
}