class Solution {
    public String mergeAlternately(String word1, String word2) {
      int n = Math.min(word1.length(), word2.length());
        int i = 0;
        StringBuilder res = new StringBuilder("");
        while(i < n){
            System.out.println(word1.charAt(i));
            res.append(word1.charAt(i));
            res.append(word2.charAt(i));
            i++;
        }

        if(word1.length() == n){
            res.append(word2.substring(i));
        }

        if(word2.length() == n){
            res.append(word1.substring(i));
        }

        return res.toString();
    }
}