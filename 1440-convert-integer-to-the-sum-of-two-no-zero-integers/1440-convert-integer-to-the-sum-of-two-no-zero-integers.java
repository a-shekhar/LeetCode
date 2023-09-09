class Solution {
    public int[] getNoZeroIntegers(int n) {
        Random rand = new Random();
        String num1 = "0";
        String num2 = "0";
        int x = 0;
        while(num1.contains("0") || num2.contains("0")){ 
            x = rand.nextInt(1, n);
            num1 = String.valueOf(x);
            num2 = String.valueOf(n-x);
        }
        return new int[]{x, n-x};
    }
}