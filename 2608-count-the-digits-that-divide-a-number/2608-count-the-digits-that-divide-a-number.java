class Solution {
    public int countDigits(int num) {
        String str = String.valueOf(num);
        int count = 0;
        for(int i = 0; i < str.length(); i++){
            int n = Integer.valueOf(String.valueOf(str.charAt(i)));
            if(num % n == 0){
                count ++;
            }
        }
        return count;
    }
}