class Solution {
    public String generateTag(String caption) {
        if(caption.trim().length() == 0){
            return "#";
        }
        String[] words = caption.trim().split(" ");
        StringBuilder builder = new StringBuilder("#" + words[0].toLowerCase());
        for(int i = 1; i < words.length; i++){
            words[i] = words[i].trim();
             if(words[i].length() > 0)
            builder.append(words[i].substring(0,1).toUpperCase());
            if(words[i].length() > 1)
            builder.append(words[i].substring(1).toLowerCase());
        }
        builder.setLength(Math.min(builder.length(), 100));
        return builder.toString();
    }
}