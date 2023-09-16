class Solution {
    public int countBalls(int lowLimit, int highLimit) {
        Map<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        int n = 0;
        for( int i = lowLimit; i <= highLimit; i++){
            sum = 0;
            n = i;
            while(n > 0){
                sum += (n%10);
                n /= 10;
            }

            map.putIfAbsent(sum, 0);
            map.put(sum, map.get(sum) + 1);
        }
        
        List<Integer> list = new ArrayList<>(map.values());
        Collections.sort(list);
        return list.get(map.size()- 1);
    }
}