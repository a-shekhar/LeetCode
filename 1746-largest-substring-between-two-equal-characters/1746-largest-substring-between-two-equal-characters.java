class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        int maxLen = -1;
        List<Character> list = new ArrayList<>();
        for(int i = 0; i <s.length(); i++){
            if(list.contains(s.charAt(i))){
                maxLen = Math.max(list.size()-list.indexOf(s.charAt(i))-1, maxLen);
            }
            list.add(s.charAt(i));
        }
        return maxLen;
    }
}