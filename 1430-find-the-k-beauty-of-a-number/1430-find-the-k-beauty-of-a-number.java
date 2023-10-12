class Solution {
     public int divisorSubstrings(int num, int k) {
        int count  = 0;
        String s = String.valueOf(num);
        int divisor = 0;
        String substr;
        for (int i = 0; i < s.length(); i++){
            substr = s.substring(i, Math.min(s.length(), i + k));
            
            if(substr.length() < k){
                break;
            }

            divisor = Integer.parseInt(substr);

            if(substr.length() == k && divisor != 0 && num % divisor == 0){
                count++;
            }
        }
        return count;
    }
}