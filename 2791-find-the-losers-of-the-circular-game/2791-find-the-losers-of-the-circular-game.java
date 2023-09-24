class Solution {
      public int[] circularGameLosers(int n, int k) {
        List<Integer> players = new ArrayList<>();
        int temp = 0;
        int lastPlayer = 1;
        players.add(1);
        for(int i = 1; i <= n; i++){
            temp = i * k;
            lastPlayer = (temp + lastPlayer) % n == 0 ? n :  (temp + lastPlayer) % n;
           
            if(players.contains(lastPlayer)){
                break;
            }else{
                players.add(lastPlayer);
            }
        }
        int[] losers = new int[n - players.size()]; 
        int index = 0;
        for(int i = 1; i <=n ; i++){
            if(!players.contains(i)){
                losers[index] = i;
                index++;
            }
        }
    
        return losers;
    }

}