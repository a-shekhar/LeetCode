class Solution {
    public boolean exist(char[][] board, String word) {
        int n = board.length;
        int m = board[0].length;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(board[i][j] == word.charAt(0) && find(i, j, board, 0, word)){
                    return true;
                }
            }
        }
        return false;
    }

    boolean find(int i, int j, char[][] board, int index, String word){
        if(index == word.length()){
            return true;
        }
        if(i < 0 || i >= board.length || j < 0 || j >= board[0].length){
            return false;
        }

        if(word.charAt(index) != board[i][j]){
            return false;
        }

        // mark this as visited so we don't have to face cycle 
        char temp = board[i][j];
        board[i][j] = '$';
        
        boolean a = find(i + 1, j, board, index + 1, word);
        boolean b = find(i - 1, j, board, index + 1, word);
        boolean c = find(i, j + 1, board, index + 1, word);
        boolean d = find(i, j - 1, board, index + 1, word);

        // backtrack it and change that $ sign
        board[i][j] = temp;

        return a || b || c || d;
    }
}