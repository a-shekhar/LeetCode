class Solution {
    public String convertToTitle(int columnNumber) {
          StringBuilder builder = new StringBuilder();
        int rem;
        while(columnNumber > 0){
            columnNumber--;
            rem = columnNumber % 26;
            builder = builder.append((char) (rem + 'A'));
            columnNumber /= 26;
        }
        return builder.reverse().toString();
    }
}