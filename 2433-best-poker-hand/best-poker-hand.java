class Solution {
     public String bestHand(int[] ranks, char[] suits) {
        boolean flag = true;
        char ch = suits[0];
        for(char c : suits){
            if(ch != c){
                flag = false;
                break;
            }
        }
        if(flag){
            return "Flush";
        }
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < ranks.length; i++){
            map.putIfAbsent(ranks[i], 0);
            map.put(ranks[i], map.get(ranks[i]) + 1);
            
        }

        if(map.containsValue(3) || map.containsValue(4) || map.containsValue(5)){
                return "Three of a Kind";
        }
        
        if(map.containsValue(2)){
            return "Pair";
        }
        return "High Card";
    }

}