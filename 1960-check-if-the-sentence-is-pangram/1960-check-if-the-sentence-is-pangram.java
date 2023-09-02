class Solution {
    public boolean checkIfPangram(String sentence) {
        Set<Integer> st = new HashSet<>();
        for(int i = 97; i< 123; i++){
            st.add(i);
        }
        for(int i =0; i<sentence.length(); i++){
            st.remove((int) sentence.charAt(i));
        }
    
       return st.size() == 0;
    }
}