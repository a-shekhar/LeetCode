class Solution {
    public String largestGoodInteger(String num) {
        int maxValue = 0;
        String ans = "";
        String temp = "";
        for(int i = 0 ; i < num.length() - 2; i++){
            temp = num.substring(i, i+3);
            if(temp.charAt(0) == temp.charAt(1) && temp.charAt(0) == temp.charAt(2)){
                if(Integer.parseInt(temp) >= maxValue){
                    maxValue = Integer.parseInt(temp);
                    ans = temp;
                }
            }
        }

        return ans;
    }
}