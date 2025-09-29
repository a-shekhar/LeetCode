class Solution {
    public boolean hasGroupsSizeX(int[] deck) {
        Map<Integer, Integer> map = new HashMap<>();
        int gcd = -1;
        for(int num : deck){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for(int num : map.values()){
            if(gcd == -1){
                gcd = num;
                continue;
            }
            gcd = findGcd(gcd, num);
        }
        return gcd > 1;
    }

    private int findGcd(int a, int b) {
        if(b == 0){
            return a;
        }
        return findGcd(b, a%b);
    }
}