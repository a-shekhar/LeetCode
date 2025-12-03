class Solution {
    public int minimumLength(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for(char ch : s.toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        int ans = 0;

        for(Map.Entry<Character, Integer> entry : map.entrySet()){
            int val = entry.getValue();
            ans += val % 2 == 0 ? 2 : 1;
        }

        return ans;
    }
}