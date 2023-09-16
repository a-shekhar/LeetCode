class Solution {
    public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
        StringBuilder num1 = new StringBuilder();
        StringBuilder num2 = new StringBuilder();
        StringBuilder sum = new StringBuilder();
        for(int i = 0; i< firstWord.length(); i++){
            num1.append((int) firstWord.charAt(i) - 97);
        }

        for(int i = 0; i< secondWord.length(); i++){
            num2.append((int) secondWord.charAt(i) - 97);
        }

        for(int i = 0; i< targetWord.length(); i++){
            sum.append((int) targetWord.charAt(i) - 97);
        }
        
        return Integer.parseInt(num1.toString()) + Integer.parseInt(num2.toString()) == Integer.parseInt(sum.toString());
    }
}