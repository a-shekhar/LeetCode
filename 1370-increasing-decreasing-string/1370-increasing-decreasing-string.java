class Solution {
    public String sortString(String s) {
        int[] freq = new int[26];
        int freqSum = s.length();
        int n = s.length();
        StringBuilder builder = new StringBuilder();
        for(int i = 0; i < s.length(); i++){
            freq[s.charAt(i) - 'a']++;
        }

        boolean reversed = false;
        while(freqSum > 0){
            StringBuilder temp = new StringBuilder();
            for(int i = 0; i< 26; i++){
                if(freq[i] > 0){
                    temp.append((char) (i + 'a'));
                    freq[i]--;
                    freqSum--;
                }
            }
            if(reversed) {
                builder.append(temp.reverse());
            }else{
                builder.append(temp);
            }
            reversed = !reversed;
        }

        return builder.toString();
    }
}