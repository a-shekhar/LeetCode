class Solution {
     public int lengthOfLongestSubstring(String s) {
        List<Character>list = new ArrayList<>();
        int longest = 0;
        int index;
        int n = 0;
        for(int i=0; i<s.length(); i++){
            if(list.contains(s.charAt(i))){
                longest = Math.max(longest, list.size());
                index = list.indexOf(s.charAt(i));
                n = 0;
                while(n <= index){
                    list.remove(0);
                    n++;
                }
            }
           
            list.add(s.charAt(i));
        }
        longest = Math.max(longest, list.size());
        return longest;
    }
}