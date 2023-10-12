class Solution {
     public int countSubstrings(String s) {
        StringBuilder str;
        StringBuilder rev;
        int count  = 0;
        for(int i=0; i < s.length(); i++){
            str = new StringBuilder();
            rev = new StringBuilder();
            for(int j = i; j <s.length(); j++){
                str.append(s.charAt(j));
                rev.insert(0, s.charAt(j));
                if(rev.toString().contentEquals(str)){
                    count++;
                }
            }

        }
        return count;
    }
}