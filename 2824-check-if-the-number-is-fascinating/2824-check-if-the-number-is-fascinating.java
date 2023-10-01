class Solution {
   public boolean isFascinating(int n) {

        String num1 = String.valueOf(2 * n);
        String num2 = String.valueOf(3 * n);
        String finalstr = n + num1 + num2;
    
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));
      
        for(int i = 0; i < finalstr.length(); i++){
            if(!nums.contains(Character.getNumericValue(finalstr.charAt(i)))){
                return false;
            }
            nums.remove(Integer.valueOf(Character.getNumericValue(finalstr.charAt(i))));
        }
        return nums.isEmpty();
    }
}