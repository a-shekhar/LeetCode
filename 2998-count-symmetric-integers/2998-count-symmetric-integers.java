class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int count = 0;
        String num;
        int left;
        int right;
        for(int i = low; i <= high; i++){
            num = String.valueOf(i);
            if(isSymmetric(num)){
                left = 0;
                right = 0;
                for(int j = 0; j<num.length()/2; j++){
                    left += Character.getNumericValue(num.charAt(j));
                    right += Character.getNumericValue(num.charAt(num.length()-1-j));
                }
                if(left == right){
                    count++;
                }
            }
        }
        return count;
    }

    private boolean isSymmetric(String n){
        if(n.length() % 2 != 0){
            return false;
        }
        return true;
    }
}