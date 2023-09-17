class Solution {
    public int alternateDigitSum(int n) {
        int sum = 0;
        List<Integer> list = new ArrayList<>();
        while(n > 0){
            list.add(n%10);
            n /= 10;
        }
        int one = 1;
    
        for(int j = list.size() - 1; j >= 0 ; j--){
            sum += (one * list.get(j));
            one *= -1;
        }
        return sum;
    }
}