class Solution {
   public String reformatNumber(String number) {
        number = number.replace(" ", "").replace("-", "");
        int rem = number.length()  % 3 == 1 ? 4 :  number.length()  % 3;
        int length = number.length() - rem;
        int count = 1;
        StringBuilder ans = new StringBuilder();
        int i = 0;
        for(i = 0; i < length; i++){
            ans.append(number.charAt(i));
            if(count % 3 == 0){
                ans.append("-");
            }
            count++;
        }


        if(rem == 0) {
            ans.deleteCharAt(ans.lastIndexOf("-")); // remove last dash if completely division
        }else if(rem == 2){
            ans.append(number.substring(i));
        } else {
            ans.append(number.substring(i, i+2)).append("-").append(number.substring(i+2));
        }
        return ans.toString();
    }
}
