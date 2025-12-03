class Solution {
    public int minimumLength(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for(char ch : s.toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        int deleted = 0;

        for(Map.Entry<Character, Integer> entry : map.entrySet()){
            int val = entry.getValue();
            while(val >= 3){
                deleted += 2;
                val -= 2;
            }
        }

        return s.length() - deleted;
    }
}