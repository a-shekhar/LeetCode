class Solution {
    public String decodeMessage(String key, String message) {
        HashMap<Character, Character> map = new HashMap<>();
        map.put(' ', ' ');
        int k = 0;
        for(int i=0; i<key.length(); i++){
            if(!map.containsKey(key.charAt(i))){
                map.put(key.charAt(i), (char)(97+k));
                k++;
            }
        }
        map.put(' ', ' '); System.out.print(map);
        StringBuilder st = new StringBuilder();
        for(int i=0; i< message.length(); i++){
            st.append(map.get(message.charAt(i)));
        }
        return st.toString();
    }
}