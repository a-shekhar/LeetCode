class Solution {
    public String mergeAlternately(String word1, String word2) {
        int n = Math.min(word1.length(), word2.length());
        StringBuilder builder = new StringBuilder();
        int i = 0;

        for(i = 0; i < n; i++){
            builder.append(word1.charAt(i));
            builder.append(word2.charAt(i));
        }

        builder.append(word1.substring(i));
        builder.append(word2.substring(i));
        return builder.toString();
    }
}