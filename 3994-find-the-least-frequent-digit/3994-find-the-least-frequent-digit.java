class Solution {
    public int getLeastFrequentDigit(int n) {
       int[] freq = new int[10];
       Arrays.fill(freq, Integer.MAX_VALUE);
            int minf = Integer.MAX_VALUE;
            int rem;
            int res = 0;

            while(n  > 0){
                rem = n % 10;
                freq[rem]++;
                n /= 10;
            }

            for(int i = 0; i < 10; i++){
               if(minf > freq[i]){
                 minf = freq[i];
                 res = i;
               }
            }

            
            return res; 
    }
}