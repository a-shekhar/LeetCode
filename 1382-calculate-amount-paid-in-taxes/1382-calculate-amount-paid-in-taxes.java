class Solution {
     public double calculateTax(int[][] brackets, int income) {
        double tax = 0;
        int band = 0;
        int upper = 0;

        for (int[] bracket : brackets) {
            if (income <= 0) {
                break;
            }
            band = Math.min(income, bracket[0] - upper);
            tax += (band * ((double) bracket[1] / 100));
            upper = bracket[0];
            income -= band;
        }
        return tax;
    }
}