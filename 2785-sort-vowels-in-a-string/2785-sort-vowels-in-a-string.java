class Solution {
    public String sortVowels(String s) {
        Set<Character> vowelsList = Set.of('a', 'e', 'i', 'o', 'u','A', 'E', 'I', 'O', 'U'
        );
        List<Character> vowels = new ArrayList<>();
        for(Character ch : s.toCharArray()){
            if(vowelsList.contains(ch)){
                vowels.add(ch);
            }
        }

        Collections.sort(vowels);
        StringBuilder builder = new StringBuilder();
        int index = 0;
        for(Character ch : s.toCharArray()){
            if(!vowelsList.contains(ch)){
                builder.append(ch);
            }else{
                builder.append(vowels.get(index++));
            }
        }
        return builder.toString();
    }
}