class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();
        findPerm(n, n, 2 * n, list, new StringBuilder());
        return list;
    }

    private void findPerm(int open, int close, int n, List<String> list, StringBuilder builder){
        if(builder.length() == n){
            list.add(builder.toString());
            return;
        }

        if(open > 0){
            builder.append("(");
            findPerm(open - 1, close, n, list, builder);
            builder.deleteCharAt(builder.length()-1);
        }

        if(close > open){
            builder.append(")");
            findPerm(open, close - 1, n, list, builder);
            builder.deleteCharAt(builder.length()-1);
        }
    }
}