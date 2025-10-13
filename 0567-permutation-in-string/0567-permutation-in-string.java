class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length() > s2.length()){
            return false;
        }
        
        int[] freqS1 = new int[26];
        int k = s1.length();
        for(int i=0; i < k; i++){
            freqS1[s1.charAt(i) - 'a']++;
        }

        int i = 0, j = 0;
        int[] freqS2 = new int[26];
        while(j < k){
            freqS2[s2.charAt(j) - 'a']++;
            j++;
        }

        while(j < s2.length()){
            if(Arrays.equals(freqS1, freqS2)){
                return true;
            }
            freqS2[s2.charAt(i) - 'a']--;
            freqS2[s2.charAt(j) - 'a']++;
            i++;
            j++;
        }

        if(Arrays.equals(freqS1, freqS2)){
                return true;
        }
        return false;
    }
}