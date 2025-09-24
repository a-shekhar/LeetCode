class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int[] chars = new int[26];
        int count = 0;
        boolean flag;
        for(int i = 0; i < allowed.length(); i++){
            chars[allowed.charAt(i) - 'a']++;
        }

        for(String word : words){
            flag = true;
            for(int i = 0; i < word.length(); i++){
                if(chars[word.charAt(i) - 'a'] == 0){
                    flag = false;
                    break;
                }
            }
            if(flag)
            count++;
        }
        return count;
    }
}