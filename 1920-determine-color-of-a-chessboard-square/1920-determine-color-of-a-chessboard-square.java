class Solution {
    public boolean squareIsWhite(String coordinates) {
        int sum =(int) coordinates.charAt(0) + (int) coordinates.charAt(1);
        return sum % 2 == 1 ? true: false;
    }
}