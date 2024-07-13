class Solution {
    public int minimumChairs(String s) {
        int maxChair = Integer.MIN_VALUE;
        int chair = 0;
        for(char ch : s.toCharArray()){
            if(ch == 'E'){
                maxChair = Math.max(maxChair, ++chair);
            }else{
                chair--;
            }
        }
        return maxChair;
    }
}