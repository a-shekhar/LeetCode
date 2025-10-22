class Solution {
    public List<Integer> findAnagrams(String s, String p) { 

        List<Integer> indexes = new ArrayList<>();

        if(p.length() > s.length()){
            return indexes;
        }

        int[] freq = new int[26];
        for(int i = 0; i < p.length(); i++){
            freq[p.charAt(i) - 'a']++;
        }

        StringBuilder pBuilder = new StringBuilder();
        for(int num : freq){
            pBuilder.append(num).append("#");
        }

      

        int i = 0, j = 0;
        StringBuilder sBuilder = new StringBuilder();


        freq = new int[26];
        while(j < p.length()){
            freq[s.charAt(j) - 'a']++;
            j++;
        }

        p = pBuilder.toString();
       // System.out.println(p);


        while(j <= s.length()){
            sBuilder = new StringBuilder();
            for(int num : freq){
                sBuilder.append(num).append("#");
            }


                //    System.out.println(sBuilder);

            if(sBuilder.toString().equals(p)){
                indexes.add(i);
            }

            if(j >= s.length()){
                break;
            }
            freq[s.charAt(i) - 'a']--;
            freq[s.charAt(j) - 'a']++;
            i++;
            j++;
        }

        return indexes;
    }
}