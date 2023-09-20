class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int minValue = Integer.MAX_VALUE;
        int index = -1;
        int val = -1;
        for(int i = 0; i< letters.length; i++){
            val = (int) letters[i] - (int) target;
            if(val > 0 && val < minValue){
                    minValue = val;
                    index = i;
                }
        }
      
        return index == -1 ? letters[0] : letters[index];
    }
}