class Solution {
    public int finalPositionOfSnake(int n, List<String> commands) {
        int i = 0;
        int j = 0;
        for(String command : commands){
            switch (command) {
                case "UP" -> i = i - 1;
                case "DOWN" -> i = i + 1;
                case "RIGHT" -> j = j + 1;
                case "LEFT" -> j = j - 1;
            }
        }

        return (i * n) + j;
    }
}