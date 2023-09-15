class Solution {
    public int[] countBits(int n) {
        int[] ans = new int[n+1];
        ans[0] = 0;
        for(int i = 1; i <= n; i++){
            ans[i] = count(i);
        }
        return ans;
    }

    private int count(int num){
        int count = 0;
        while(num > 0){
            if(num % 2 == 1){
                count++;
            }
            num /= 2;
        }
        return count;
    }
}