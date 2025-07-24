class Solution {
    public String longestCommonPrefix(String[] strs) {
        String prefixToMatch = strs[0];
        for(int i = 1; i < strs.length; i++){
            while(!strs[i].startsWith(prefixToMatch)){
                prefixToMatch  = prefixToMatch.substring(0, prefixToMatch.length() - 1);
            }

            if(prefixToMatch.isEmpty()){
                prefixToMatch = "";
            }
        }

        return prefixToMatch;
    }
}