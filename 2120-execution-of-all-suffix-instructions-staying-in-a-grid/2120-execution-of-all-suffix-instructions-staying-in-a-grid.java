class Solution {
    public int[] executeInstructions(int n, int[] startPos, String s) {
        int len = s.length();
        int[] res = new int[len];

        for(int i = 0; i < len; i++){
            int row = startPos[0];
            int col = startPos[1];
            int count = 0;

            for(int j = i; j < len; j++){

                char ch = s.charAt(j);

                switch (ch) {
                    case 'U':
                        row -= 1;
                        break;
                    case 'D':
                        row += 1;
                        break;
                    case 'R':
                        col += 1;
                        break;
                    case 'L':
                        col -= 1;
                        break;
                    default:
                        throw new AssertionError();
                }

                if(row < 0 || col < 0 || row >= n || col >= n){
                    break;
                }

                count++;
            }
            res[i] = count;
        }
        return res;
    }
}