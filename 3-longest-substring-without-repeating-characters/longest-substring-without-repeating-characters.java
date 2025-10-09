class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
       int i = 0, j = 0, longest = 0;
       while(j < s.length()){
           char ch = s.charAt(j);
           if(!set.contains(ch)){
              set.add(ch);
              j++;
              longest = Math.max(longest, j - i);
           }else{
             set.remove(s.charAt(i));
              i++;
           }
       }
       return longest;
    }
}