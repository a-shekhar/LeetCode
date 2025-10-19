class Solution {
    public char kthCharacter(int k) {
        StringBuilder builder = new StringBuilder();
        builder.append("a");
        while(builder.length() < k){
            int size = builder.length();
            for(int i = 0; i < size; i++){
                builder.append((char) (builder.charAt(i) + 1));
            }
        }

        //System.out.println(builder);
        return builder.charAt(k-1);
    }
}