class Solution {
    public int maxNumberOfBalloons(String text) {
        int count = 0;
        String balloon = "balloon";
        boolean flag = false;
        List<Character> list = new ArrayList<>();
        for(int i=0; i < text.length(); i++){
            list.add(text.charAt(i));
        }
        while(true){
            flag = true;
            for(int i = 0; i < balloon.length(); i++){
                if(!list.contains(balloon.charAt(i))){
                    flag = false;
                    break;
                }else{
                    list.remove(Character.valueOf(balloon.charAt(i)));
                }
            }
            if(flag){
                count++;
            }else{
                break;
            }

        }
        return count;
    }
}