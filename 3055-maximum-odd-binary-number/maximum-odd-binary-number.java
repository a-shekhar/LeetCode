class Solution {
    public String maximumOddBinaryNumber(String s) {
        StringBuilder ans = new StringBuilder();
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '1'){
                ans.insert(0, '1');
            }else{
                ans.append('0');
            }
        }
        ans.deleteCharAt(0);
        ans.append('1');
        return ans.toString();
    }
}