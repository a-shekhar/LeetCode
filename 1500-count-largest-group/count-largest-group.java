class Solution {
    public int countLargestGroup(int n) {
         Map<Integer, Integer> map = new HashMap<>();
        int maxGroup = 0; 
        for(int i = 1; i <= n; i++){
            int sum = 0;
            int num = i;
            while(num > 0){
                sum += num % 10;
                num /= 10;
            }

            int val = map.getOrDefault(sum, 0) + 1;
            maxGroup = Math.max(maxGroup, val);
            map.put(sum, val);
        }

        int value = maxGroup;
        return (int) map.values().stream().filter(x -> x == value).count();
    }
}