class Solution {
    public int appendCharacters(String s, String t) {
        if(s.equals(t)){
            return 0;
        }

        int index = 0;
        int count = 0;

        for(int i = 0; i < s.length() && index < t.length(); i++){
            if(s.charAt(i) ==  t.charAt(index)){
                index++;
                count++;
            }
            
        }

        return t.length() - count;
    }
}