class Solution {
    public boolean checkIfPangram(String sentence) {
        Set<Integer> st = new HashSet<>();
        for(int i =0; i<sentence.length(); i++){
            st.add((int) sentence.charAt(i));
        }
    
       return st.size() == 26;
    }
}