class Solution {
    public String findValidPair(String s) {
        Map<Character, Integer> map = new HashMap<>();

        for(Character ch : s.toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for(int i = 1; i < s.length(); i++){
            char curr = s.charAt(i);
            char prev = s.charAt(i-1);
            if(curr != prev && Integer.valueOf(curr - '0').equals(map.get(curr))
                && Integer.valueOf(prev - '0').equals(map.get(prev))){
                    String str = "";
                    return str + prev + curr;
               }
            
        }
        return  "";
    }
}