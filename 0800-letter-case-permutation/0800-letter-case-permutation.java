class Solution {
    public List<String> letterCasePermutation(String s) {
        List<String> result = new ArrayList<>();
        StringBuilder builder = new StringBuilder();
        findPermutation(0, s, builder, result);
        return result;
    }


    private void findPermutation(int index, String s, StringBuilder builder, List<String> result) {
        if(index == s.length()){
            result.add(builder.toString());
            return;
        }

        char ch = s.charAt(index);

        if(Character.isAlphabetic(ch)){
        // change case
        if(Character.isUpperCase(ch)){
            builder.append(Character.toLowerCase(ch));
        } else {
            builder.append(Character.toUpperCase(ch));
        }
        findPermutation(index + 1, s, builder, result);

        // do not change case of last char
        builder.deleteCharAt(builder.length() - 1);
        builder.append(ch);
        findPermutation(index + 1, s, builder, result);
        builder.deleteCharAt(builder.length() - 1);
        } else {
            builder.append(ch);
            findPermutation(index + 1, s, builder, result);
            builder.deleteCharAt(builder.length() - 1);
        }
    }
}