class Solution {
        public int vowelStrings(String[] words, int left, int right) {
        int count = 0;
        String vowels = "aeiou";
        for(int i = left; i <= right; i++){
            if(vowels.contains(String.valueOf(words[i].charAt(0)))
                    && vowels.contains(String.valueOf(words[i].charAt(words[i].length()-1)))){
                count++;
            }
        }
        return count;
    }
}