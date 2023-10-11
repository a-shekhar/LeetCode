class Solution {
    public int countPrimeSetBits(int left, int right) {
        Map<Integer, Boolean> map = new HashMap<>();
        int ones = 0;
        int n;
        int primes = 0;
        for(int i = left; i<= right; i++){
            n = i;
            ones = 0;
            while (n > 0){
                if(n % 2 == 1){
                    ones++;
                }
                n /= 2;
            }
            
            boolean isPrime;

            if(map.containsKey(ones)){
                if(map.get(ones)){
                    primes++;
                }
            }else{
                isPrime = isPrime(ones);
                map.put(ones, isPrime);
                primes = isPrime ? primes + 1 : primes;
            }
        }
        return primes;
    }

    private boolean isPrime(int n){
        if(n < 2){
            return false;
        }
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }

}