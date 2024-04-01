class Solution {
    public int lengthOfLastWord(String s) {
        int count = 0;
        s = s.trim();
        for(int j = s.length()-1; j >= 0; j--){
            if(s.charAt(j) == ' '){
                break;
            }
            count++;
        }
        return count;
    }
}