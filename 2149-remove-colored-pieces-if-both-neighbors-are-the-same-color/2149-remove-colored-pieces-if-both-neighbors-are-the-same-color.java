class Solution {
    public boolean winnerOfGame(String colors) {
        int countAlice = 0;
        int countBob = 0;
        for(int i=1; i < colors.length()-1; i++) {
            if (colors.charAt(i - 1) == 'A' && colors.charAt(i) == 'A' && colors.charAt(i + 1) == 'A') {
                countAlice++;
            }else if (colors.charAt(i - 1) == 'B' && colors.charAt(i) == 'B' && colors.charAt(i + 1) == 'B') {
                countBob++;
            }
        }
        return countAlice > countBob;
    }

}