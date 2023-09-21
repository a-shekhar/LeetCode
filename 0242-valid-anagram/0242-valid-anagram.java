class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        List<Character> list = new ArrayList<>();
        for(int i = 0; i < t.length(); i++){
            list.add(t.charAt(i));
        }

        for(int i = 0; i < s.length(); i++){
            if(!list.contains(s.charAt(i))){
                return false;
            }
            list.remove(Character.valueOf(s.charAt(i)));
        }
        return true;
    }

}