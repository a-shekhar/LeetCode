class Solution {
    public int strStr(String haystack, String needle) {
        int n = haystack.length();
        int len = needle.length();
        for(int i = 0; i < n; i++){
            if(n - i < len){
                return -1;
            }

            if(haystack.charAt(i)  == needle.charAt(0)){
                int j = 0;
                int k = i;
                while(needle.charAt(j) == haystack.charAt(k) && j < len){
                    
                    if(j == len - 1){
                        return i;
                    }
                    j++;
                    k++;
                }
            }
        }
        return - 1;
    }
}