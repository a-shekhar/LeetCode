class Solution {
    public int strStr(String haystack, String needle) {
        if(needle.length() > haystack.length()){
            return -1;
        }
        int k = needle.length();
        int i = 0;
        int j = 0;
        StringBuilder builder = new StringBuilder();
        while(j < k){
            builder.append(haystack.charAt(j));
            j++;
        }


        while(j < haystack.length()){
            if(builder.toString().equals(needle)){
                return i;
            }
            builder = new StringBuilder(builder.substring(1));
            builder.append(haystack.charAt(j));
          //  System.out.println(builder);
            i++;
            j++;
        }

        if(builder.toString().equals(needle)){
            return i;
        }

        return -1;
    }
}