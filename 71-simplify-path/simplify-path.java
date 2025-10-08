class Solution {
    public String simplifyPath(String path) {
         String[] paths = path.split("/");
        StringBuilder builder = new StringBuilder("/");
        System.out.println(Arrays.toString(paths));
        Deque<String> stack = new ArrayDeque<>();

        for(String str : paths){
            if(!str.isBlank()){
                if(str.equals("..")){
                    if(!stack.isEmpty())
                    stack.pop();
                } else if(str.equals(".") || str.equals("..") || str.equals("/") || str.equals("//")){
                    // just skip it
                } else {
                    stack.push(str);
                }
            }
        }

        System.out.println(stack);

        while(!stack.isEmpty()){
            builder.insert(0, stack.pop()).insert(0, "/");
        }

        if(builder.length() > 1)
        builder.deleteCharAt(builder.length()-1);
        return builder.toString();
    }
}