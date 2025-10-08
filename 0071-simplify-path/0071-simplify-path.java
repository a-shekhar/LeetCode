class Solution {
    public String simplifyPath(String path) {
         String[] paths = path.split("/");
        StringBuilder builder = new StringBuilder("/");
        System.out.println(Arrays.toString(paths));
        Deque<String> stack = new ArrayDeque<>();

        for(String str : paths){
            if (str.isBlank() || str.equals(".")) {
                // skip empty and current directory
                continue;
            }

            if (str.equals("..")) {
                if (!stack.isEmpty()) stack.pop(); // go one directory up
            } else {
                stack.push(str); // add valid folder name
            }
        }

        Iterator<String> it = stack.descendingIterator(); // bottom to top
        while(it.hasNext()){
            builder.append(it.next());
            if(it.hasNext()){
                builder.append("/");
            }
        }

        return builder.toString();
    }
}