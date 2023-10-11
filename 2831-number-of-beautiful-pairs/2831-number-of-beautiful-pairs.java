class Solution {
     public int countBeautifulPairs(int[] nums) {
        int count = 0;
        int n1;
        String str2;
        for(int i = 0; i < nums.length - 1; i++){
             n1 = Character.getNumericValue(String.valueOf(nums[i]).charAt(0));
          
            for(int j = i +1 ; j < nums.length; j++){
                str2 = String.valueOf(nums[j]);
                if(gcd(n1,  Character.getNumericValue(str2.charAt(str2.length()-1)))){
                    count++;
                }
            }
        }
        return count;
    }

    private boolean gcd(int x, int y){
        for(int i = 2; i <= Math.min(x, y); i++){
            if(x % i == 0 && y % i == 0 ){
                return false;
            }
        }
        return true;
    }
}