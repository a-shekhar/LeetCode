class Solution {
    public String generateTag(String caption) {
        if(caption.trim().length() == 0){
            return "#";
        }
        String[] words = caption.trim().split("\\s+");
        StringBuilder builder = new StringBuilder("#" + words[0].toLowerCase());
        for(int i = 1; i < words.length; i++){
            builder.append(words[i].substring(0,1).toUpperCase()).append(words[i].substring(1).toLowerCase());
        }
        builder.setLength(Math.min(builder.length(), 100));
        return builder.toString();
    }
}