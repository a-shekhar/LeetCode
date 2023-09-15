class Solution {
    public boolean halvesAreAlike(String s) {
        String vowels = "aeiouAEIOU";
        String str1 = s.substring(0, s.length()/2);
        String str2 = s.substring(s.length()/2);
        int count1 = 0;
        int count2 = 0;
        for(int i=0; i<str1.length(); i++){
            if(vowels.contains(String.valueOf(str1.charAt(i)))){
                count1++;
            }
        }

         for(int i=0; i<str2.length(); i++){
            if(vowels.contains(String.valueOf(str2.charAt(i)))){
                count2++;
            }
        }
        return count1 == count2;
    }
}