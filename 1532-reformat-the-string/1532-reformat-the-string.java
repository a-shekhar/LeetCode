class Solution {
       public String reformat(String s) {
        StringBuilder letters  = new StringBuilder();
        StringBuilder digits  = new StringBuilder();
        for(int i=0; i< s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
                digits.append(Character.getNumericValue(s.charAt(i)));
            } else {
                letters.append(s.charAt(i));
            }
        }

        if(Math.abs(letters.length() - digits.length()) > 1){
            return "";
        }

        StringBuilder ans = new StringBuilder();

        if(letters.length() >= digits.length()){
            for(int i = 0; i < digits.length(); i++){
                ans.append(letters.charAt(i)).append(Character.getNumericValue(digits.charAt(i)));
            }
            if(letters.length() != digits.length()){
               ans.append(letters.charAt(letters.length()-1));
            }
            
        }else{
            for(int i = 0; i < letters.length(); i++){
                ans.append(Character.getNumericValue(digits.charAt(i))).append(letters.charAt(i));
            }
           if(letters.length() != digits.length()){
            ans.append(Character.getNumericValue(digits.charAt(digits.length()-1)));
           }
        }
        
        return ans.toString();
    }
}
