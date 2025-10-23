class Solution {
    public boolean scoreBalance(String s) {
        int totalSum = 0;
        int sum  = 0;
        for(int i = 0; i < s.length(); i++){
            totalSum += s.charAt(i) - 'a' + 1; 
        }

        for(int i = 0; i < s.length(); i++){
            sum += s.charAt(i) - 'a' + 1; 
            if(sum == totalSum - sum){
                return true;
            }
        }
        
        return false;
    }
}