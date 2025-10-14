class Solution {
    public static  List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();

        String[] mapping = {"",    "",    "abc",  "def", "ghi",
        "jkl", "mno", "pqrs", "tuv", "wxyz"};

        find(digits, 0, new StringBuilder(), result, mapping);

        return result;
    }

    private static void find(String digits, int index, StringBuilder str, List<String> result, String[] mapping) {
        if(index == digits.length()){
            //if(str.length() == digits.length())
            result.add(str.toString());
            return;
        }

        String mapForIndex = mapping[digits.charAt(index) - '0'];
      
        int len = str.length();
        
        for(int i = 0; i < mapForIndex.length(); i++){
            str.append(mapForIndex.charAt(i));

            find(digits, index + 1, str, result, mapping);
            str.setLength(len);
            //find(digits, index + 1, str, result, mapping);
        }

    }
}