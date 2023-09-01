class Solution {
    public int maximum69Number (int num) {
        String strnum = String.valueOf(num);
        String res = "";
        int i = 0;
        while(i < strnum.length()){
            if(strnum.charAt(i) == '6'){
                res += "9";
                break;
            }
            else{
                res += strnum.charAt(i);
               }
            i++;
        }
        // to make sure no digit is left out
        if (i <= strnum.length() - 1){
            res += strnum.substring(i+1);
        }
        return Integer.valueOf(res);
    }
}