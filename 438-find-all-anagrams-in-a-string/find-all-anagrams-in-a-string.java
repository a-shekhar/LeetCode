class Solution {
    public List<Integer> findAnagrams(String s, String p) { 

        List<Integer> indexes = new ArrayList<>();
        int pLen = p.length();
        int sLen = s.length();

        if(pLen > sLen){
            return indexes;
        }
        
        int[] pCount = new int[26];
        int[] sCount = new int[26];

        int i = 0, j = 0;


        while(j < pLen){
            pCount[p.charAt(j) - 'a']++;
            sCount[s.charAt(j) - 'a']++;
            j++;
        }


        while(j <= sLen){
            
            if(Arrays.equals(pCount, sCount)){
                indexes.add(i);
            }

            if(j >= sLen) break;

            sCount[s.charAt(i) - 'a']--;
            sCount[s.charAt(j) - 'a']++;
            i++;
            j++;
        }

        return indexes;
    }
}