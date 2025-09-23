class Solution {
    public String longestCommonPrefix(String[] strs) {
        String longestCommonPrefix = strs[0];
        int n = strs.length;
        StringBuilder strBuilder;
        for(int i = 1; i < n; i++){
            strBuilder = new StringBuilder();
            for(int j = 0;  j < strs[i].length() && j < longestCommonPrefix.length(); j++){
                if(strs[i].charAt(j) != longestCommonPrefix.charAt(j)){
                    break;
                }
                strBuilder.append(strs[i].charAt(j));
            }
            longestCommonPrefix = strBuilder.toString();
        }
        return longestCommonPrefix;
    }
}