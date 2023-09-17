class Solution {
    public boolean areNumbersAscending(String s) {
        List<Integer> list = new ArrayList<>();
        String[] words = s.split(" ");
        for(String word : words){
            if(Character.isDigit(word.charAt(0))){
                list.add(Integer.parseInt(word));
            }
        }

        for(int i = 0 ; i < list.size() - 1; i++){
            if(list.get(i) >= list.get(i+1)){
                return false;
            }
        }
        return true;
    }
}