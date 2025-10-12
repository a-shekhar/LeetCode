class Solution {
    public boolean isBalanced(String num) {
        int sum = 0;
        boolean isAdd = true;
        for(int i = 0; i < num.length(); i++){
            int n = num.charAt(i) - '0';
            sum = isAdd ? sum + n : sum - n;
            isAdd = !isAdd;
        }
        return sum == 0;
    }
}