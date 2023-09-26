class Solution {
    public boolean strongPasswordCheckerII(String password) {
        if(password.length() < 8){
            return false;
        }
        String special = "!@#$%^&*()-+";
        boolean lowercase = false;
        boolean uppercase = false;
        boolean digit = false;
        boolean specialChar = false;
        for(int i =0; i<password.length(); i++){
            if(i < password.length() - 1 && password.charAt(i) == password.charAt(i+1)){
                return false;
            }
            if(!lowercase && Character.isLowerCase(password.charAt(i))){
                lowercase = true;
            }

            if(!uppercase && Character.isUpperCase(password.charAt(i))){
                uppercase = true;
            }

            if(!digit && Character.isDigit(password.charAt(i))){
                digit = true;
            }

            if(!specialChar && special.contains(String.valueOf(password.charAt(i)))){
                specialChar = true;
            }
        }
        return lowercase && uppercase && digit && specialChar;
    }

}