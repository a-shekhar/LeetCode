class Solution {
    public int lengthOfLongestSubstring(String s) {
        List<Character> list = new ArrayList<>();
        int j = 0;
        int n = s.length();
        int longest = 0;
        while(j < n){
            char ch  = s.charAt(j);
            if(!list.contains(ch)) {
                list.add(ch);
                longest = Math.max(longest, list.size());
            } else {
                longest = Math.max(longest, list.size());
                // remove from front till we have that char
               while(list.contains(ch)){
                  list.remove(0);
               }
               list.add(ch);
            }
            j++;
        }
        return longest;
    }
}