class Solution {
    public char findTheDifference(String s, String t) {
        List<Character> list = new ArrayList<>();
        for(int i=0; i< t.length(); i++){
            list.add(t.charAt(i));
        }

        for(int i=0; i< s.length(); i++){
            list.remove(Character.valueOf(s.charAt(i)));
        }

        return list.get(0);
    }
}