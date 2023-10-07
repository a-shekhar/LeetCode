class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        if(s.length() == 1){
            return map.get(s.charAt(0));
        }
        int sum =0;
        for(int i = 0; i < s.length()-1; i++){
            if(map.get(s.charAt(i)) < map.get(s.charAt(i+1))){
                sum += (map.get(s.charAt(i+1)) - map.get(s.charAt(i)));
                i++;
            }else{
                sum += map.get(s.charAt(i));
            }
        }
        // for the last character
        if(map.get(s.charAt(s.length()-1)) <= map.get(s.charAt(s.length()-2))){
            sum += map.get(s.charAt(s.length()-1));
        }
        return  sum;
    }
}