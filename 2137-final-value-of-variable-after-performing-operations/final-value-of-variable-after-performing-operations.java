class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int x = 0;
        for(String op : operations){
            char ch = op.charAt(1);
            switch (ch) {
                case '+' ->  x++;
                case '-' -> x--;
            }
        }
        return x;
    }
}