class Solution {
     public int countConsistentStrings(String allowed, String[] words) {
        Set<Character> set  = new HashSet<>();
        for(int i = 0; i < allowed.length(); i++){
            set.add(allowed.charAt(i));
        }

        boolean flag = false;
        int count = 0;
        for(String  word: words){
            flag = true;
            for(int i = 0; i < word.length(); i++){
                if(!set.contains(word.charAt(i))){
                    flag = false;
                    break;
                }
            }
            if(flag){
                count++;
            }
        }
        return count;
    }
}