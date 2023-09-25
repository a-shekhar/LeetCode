class Solution {
    public String longestCommonPrefix(String[] strs) {
        String first = strs[0];
        String pre = "";
        for(int i = 0; i < first.length(); i++){
            pre += first.charAt(i);
            for(int j = 0; j < strs.length; j++){
                if(!strs[j].startsWith(pre)){
                    return pre.substring(0, pre.length()-1);
                }
            }
        }
        return pre;
    }
}