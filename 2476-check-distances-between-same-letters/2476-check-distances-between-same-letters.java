class Solution {
    public boolean checkDistances(String s, int[] distance) {
        Map<Character, Integer> map = new HashMap<>();
        int dis;
        for(int i=0; i<s.length(); i++){
            if(map.containsKey(s.charAt(i))){
                dis = i - map.get(s.charAt(i))  - 1;    
                if(dis != distance[(int)s.charAt(i) - 97]){
                    return  false;
                }
            }
            map.put(s.charAt(i), i);
        }
        return true;
    }
}