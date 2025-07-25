class Solution {
    public int hammingWeight(int n) {
       int count = 0;
        while(n > 0){
            count += n & 1; //compare right most bit 
            n = n >>> 1; // unsigned shift bit by 1 
        }
        return count;
    }
}