class Solution {
    public int longestPalindrome(String s) {
       Set<Character> oddSet = new HashSet<>();
        for(int i = 0; i < s.length(); i++){
            Character ch = s.charAt(i);
            if(oddSet.contains(ch)){
                oddSet.remove(ch);
            }else{
                oddSet.add(ch);
            }
        }

        if(oddSet.isEmpty()){
            return s.length();
        }
        return s.length()  - oddSet.size() + 1; // only one odd 
    }
}