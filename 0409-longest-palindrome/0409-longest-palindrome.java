class Solution {
    public int longestPalindrome(String s) {
        int length = 0;
        List<Character> list = new ArrayList<>();
        for(int i = 0; i < s.length(); i++){
            if(list.contains(s.charAt(i))){
                length += 2;
                list.remove(Character.valueOf(s.charAt(i)));
            }else{
                list.add(s.charAt(i));
            }
        }
        if(!list.isEmpty()){
            length++;
        }
        return length;
    }
}