class Solution {
    public int maxFreqSum(String s) {
        int maxVow = 0;
        int maxCons = 0;
        int[] freq = new int[26];
        Set<Character> set = Set.of('a', 'e', 'i', 'o', 'u');
        for(char ch : s.toCharArray()){
            freq[ch - 'a']++;
        }

        for(int i = 0; i < 26; i++){
            if(set.contains((char) (i + 'a'))){
                maxVow = Math.max(maxVow, freq[i]);
            }else{
                maxCons = Math.max(maxCons, freq[i]);
            }
        }
        return maxVow + maxCons;
    }
}