class Solution {
    public int minSteps(String s, String t) {
        int[] freq = new int[26];
        for(int i = 0; i < s.length(); i++){
            freq[s.charAt(i) - 'a']++;
            freq[t.charAt(i) - 'a']--;
        }

        System.out.println(Arrays.toString(freq));


        int count = 0;
        for(int num : freq){
            if(num > 0) count += num;
        }
        return count;
    }
}