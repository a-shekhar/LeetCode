class Solution {
    public int countPrimeSetBits(int left, int right) {
        boolean[] primeNumbers = new boolean[25];
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
            System.out.println(ones);

            if(primeNumbers[ones]){
                primes++;
                System.out.println("aditya" + " " + primes);
            }else if(isPrime(ones)){
                primes++;
                primeNumbers[ones] = true;
                System.out.println("raj" + " " + primes);
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