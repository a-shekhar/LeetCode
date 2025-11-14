class Solution {
    public String processStr(String s) {
        int len = s.length();
        StringBuilder builder = new StringBuilder();
        for(int i = 0; i < len; i++){
            char ch = s.charAt(i);
            if(ch == '*'){
                if(!builder.isEmpty())
                builder.deleteCharAt(builder.length()-1);
            } else if(ch == '#'){
                builder.append(builder);
            } else if(ch == '%'){
                builder = builder.reverse();
            } else {
                builder.append(ch);
            }
        }
        return builder.toString();
    }
}