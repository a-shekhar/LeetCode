class Solution {
    public int minDeletion(String s, int k) {
        int[] freq = new int[26];
        for(int i = 0; i < s.length(); i++){
            freq[s.charAt(i) - 'a']++;
        }

        Arrays.sort(freq);
        int count = 0;
        for(int i = 0;  i < 26 - k ; i++){
            count += freq[i];
        }

        return count;
    }
}