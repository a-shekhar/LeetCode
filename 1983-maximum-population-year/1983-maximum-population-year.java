class Solution {
    public int maximumPopulation(int[][] logs) {
        Map<Integer, Integer> map = new HashMap<>();
        int temp = 0;
        int max = 0;
        for(int[] log : logs){
            for(int year = log[0]; year < log[1]; year++){
                temp = map.getOrDefault(year, 0) + 1;
                max = Math.max(max, temp);
                map.put(year, temp);
            }
        }
  
        int year = Integer.MAX_VALUE;
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(entry.getValue() == max){
                year = Math.min(year, entry.getKey());
            }
        }
        return year;
    }
}