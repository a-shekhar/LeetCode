class Solution {
    public int[] separateDigits(int[] nums) {
         List<Character> list = new ArrayList<>();
         String temp;

         for(int num : nums){
             temp = String.valueOf(num);
             for(int i=0; i < temp.length(); i++){
                 list.add(temp.charAt(i));
             }
         }

         int[] ans = new int[list.size()];
         for(int i = 0; i < ans.length; i++){
             ans[i] = Character.getNumericValue(list.get(i));
         }
         return ans;
    }
}