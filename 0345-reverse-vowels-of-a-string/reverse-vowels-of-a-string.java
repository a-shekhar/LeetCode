class Solution {
    public String reverseVowels(String s) {
        String vowels = "AEIOUaeiou";
        int i = 0;
        int j = s.length() - 1;
        StringBuilder ans = new StringBuilder(s);
        while(i < j){
            if(!vowels.contains(String.valueOf(s.charAt(i)))){
                i++;
            } else if (!vowels.contains(String.valueOf(s.charAt(j)))) {
                j--;
            }else {
                ans.setCharAt(i, s.charAt(j));
                ans.setCharAt(j,s.charAt(i));
                i++;
                j--;
            }
        }
        return ans.toString();
    }

}