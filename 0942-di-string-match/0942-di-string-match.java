class Solution {
    public int[] diStringMatch(String s) {
        int start = 0;
        int end = s.length();
        int[] result = new int[end+1];

        // result[0] = s.charAt(0) == 'I' ? start++ : end--;
        // if(s.charAt(0) == 'I'){
        //     result[0] = start++
        // }

        for(int i = 0; i < s.length(); i++){
            result[i] = s.charAt(i) == 'I' ? start++ : end--;
        }

        result[s.length()] = start; // or end (same value)

        return result;
    }
}