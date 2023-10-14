class Solution {
      public String greatestLetter(String s) {
        List<Character> chars = new ArrayList<>();
        char ch;
        int maxCh = 0;
        for(int i=0; i<s.length(); i++){
            ch = s.charAt(i);
            if(Character.isLowerCase(ch) && chars.contains(Character.toUpperCase(ch))){
               maxCh = Math.max((int)Character.toUpperCase(ch), maxCh);
            }else if(Character.isUpperCase(ch) && chars.contains(Character.toLowerCase(ch))){
                maxCh = Math.max((int)Character.toUpperCase(ch), maxCh);
            }
            chars.add(ch);
        }
        return maxCh == 0 ? "" : String.valueOf((char) maxCh);
    }

}