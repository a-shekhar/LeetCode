class Solution {
    public int subtractProductAndSum(int n) {
        int multi = 1;
        int sum = 0;
        int rem = 0;
        while(n > 0){
            rem = n % 10;
            multi *= rem;
            sum += rem;
            n = n/10;
        }
        return multi-sum;
    }
}