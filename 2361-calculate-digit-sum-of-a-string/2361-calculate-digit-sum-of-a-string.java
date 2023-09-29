class Solution {
    public String digitSum(String s, int k) {
        int n= 0;
        String temp;
        String str = "";
        int sum = 0;
        while (s.length() > k) {
            str = "";
            for (int i = 0; i < s.length(); i += k) {
                n = Math.min(s.length(), i + k);
                temp = s.substring(i, n);
                sum = 0;
                for(int j= 0; j < temp.length(); j++){
                         sum += Character.getNumericValue(temp.charAt(j));
                }
               
                str += sum;
                        }
            s = str;            
        }
        return s;
    }
}