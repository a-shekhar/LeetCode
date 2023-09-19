class Solution {
    public int getLucky(String s, int k) {
        StringBuilder modified = new StringBuilder();
        for(int i = 0; i< s.length(); i++){
            modified.append((int) (s.charAt(i) - 96));
        }


        s = modified.toString();
        int sum = 0;
        while(k > 0){
            sum = 0;
            for(int i = 0; i < s.length(); i++){
                sum += Character.getNumericValue(s.charAt(i));
            }
         
            s = String.valueOf(sum);
            k--;
        }
        return sum;
    }
}