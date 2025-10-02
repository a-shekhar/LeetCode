class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        StringBuilder builder = new StringBuilder();
        findPermutation(n, n, builder, result, 2 * n);
        return result;
    }


    private void findPermutation(int open, int close, StringBuilder builder, List<String> result, int n) {
        if(builder.length() == n){
            result.add(builder.toString());
            return;
        }

        // add with ( bracket
        if(open > 0){
            builder.append("(");
            findPermutation(open - 1, close, builder, result, n);
            // delete last char
            builder.deleteCharAt(builder.length() - 1);
        }

        if (close > open) {
            builder.append(")");
            findPermutation(open, close - 1, builder, result, n);
            // delete last char
            builder.deleteCharAt(builder.length() - 1);
        }
    }
}