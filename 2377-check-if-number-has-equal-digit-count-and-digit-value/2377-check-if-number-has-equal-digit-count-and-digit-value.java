class Solution {
    public boolean digitCount(String num) {
        Map<Integer, Integer> map = new HashMap<>();
        int temp;
        int val;
        for(int i=0; i< num.length(); i++){
            temp = Character.getNumericValue(num.charAt(i));
            map.putIfAbsent(temp, 0);
            map.put(temp, map.get(temp) + 1);
        }

        for(int i=0; i< num.length(); i++){
            temp = Character.getNumericValue(num.charAt(i));
            val = map.getOrDefault(i, 0);
            if(temp != val){
                return false;
            }
            
        }
        
        return true;
    }
}