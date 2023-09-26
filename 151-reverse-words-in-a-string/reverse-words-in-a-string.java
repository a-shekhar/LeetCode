class Solution {
   public String reverseWords(String s) {
        String[] words = s.trim().split("\\s+");
            int n = words.length;
            String temp = "";
            for(int i=0; i < n/2; i++){
                temp = words[i];
                words[i] = words[n-1-i];
                words[n-1-i] = temp;
            }
            return String.join(" ", words);
        }
}