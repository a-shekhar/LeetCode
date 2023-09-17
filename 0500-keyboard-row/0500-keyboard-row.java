class Solution {
    public String[] findWords(String[] words) {
        String a = "qwertyuiop";
        String b = "asdfghjkl";
        String c = "zxcvbnm";
        String row = "";
        List<String> list = new ArrayList<>();
        for(String str: words){
            String word = str.toLowerCase();
            if(a.contains(String.valueOf(word.charAt(0)))){
                row = a;
            }else if(b.contains(String.valueOf(word.charAt(0)))){
                row = b;
            }else{
                row = c;
            }
            boolean flag = true;
            for(int i = 1; i < word.length(); i++){
                if(!row.contains(String.valueOf(word.charAt(i)))){
                    flag = false;
                    break;
                }
            }
            if(flag){
                list.add(str);
            }
        }
        return list.stream().toArray(String[] :: new);
    }
}