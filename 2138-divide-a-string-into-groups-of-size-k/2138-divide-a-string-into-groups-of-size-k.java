class Solution {
    public String[] divideString(String s, int k, char fill) {
        int n = s.length() % k == 0 ? s.length() / k : (s.length() / k) + 1;

        String[] words = new String[n];
        String word = "";
        int count = 0;
        int index = 0;
        for(int i = 0; i < s.length(); i++){
            word += s.charAt(i);
            count++;
            if(i !=s.length() - 1 && count % k == 0){
                words[index] = word;
                word = "";
                index++;
            }
        }

        if(word.length() < k){
            word  += String.valueOf(fill).repeat(k-word.length());
            words[n-1] = word;
        }else{
            words[n-1] = word;
        }
        return  words;
    }
}