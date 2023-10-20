class Solution {
    public int similarPairs(String[] words) {
        Map<Integer , Set<Character>> map = new HashMap<>();
        Set<Character> set1 = new HashSet<>();
        Set<Character> set2 = new HashSet<>();
        int pair =0;
        for(int i = 0; i < words.length-1; i++) {
            if (!map.containsKey(i)) {
                set1 = new HashSet<Character>();
                for (int ch = 0; ch < words[i].length(); ch++) {
                    set1.add(words[i].charAt(ch));
                }
                map.put(i, set1);
            }else{
                set1 = map.get(i);
            }

            for (int j = i + 1; j < words.length; j++) {
                if (!map.containsKey(j)) {
                    set2 = new HashSet<Character>();
                    for (int ch = 0; ch < words[j].length(); ch++) {
                        set2.add(words[j].charAt(ch));
                    }
                    map.put(j, set2);
                }else{
                    set2 = map.get(j);
                }

                if (set1.equals(set2)) {
                    pair++;
                }
            }

        }
        return pair;
    }
}