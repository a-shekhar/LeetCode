class Solution {
    public String thousandSeparator(int n) {
        if(n <= 999){
            return String.valueOf(n);
        }

        String num = String.valueOf(n);
        int count = 0;
        StringBuilder builder = new StringBuilder();
        for(int j= num.length() - 1; j >=0; j--){
            builder.insert(0, num.charAt(j));
            count++;
            if(j != 0 && count % 3 == 0){
                builder.insert(0, '.');
            }
        }
        return builder.toString();
    }
}