class Solution {
    public String removeStars(String str) {
        int len = str.length();
		StringBuilder st = new StringBuilder();
		
		//String reg = "[a-zA-Z\\s*]";
		for(int i=0; i<len; i++) {
			char c =str.charAt(i);
			if(c == '*') {
				if(st.length() > 0) {
					st.deleteCharAt(st.length() -1);
				}
			}else
				st.append(c);
		}
		return st.toString();		
    }
}