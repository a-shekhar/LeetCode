class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
       
        for(String str: strs){
            int[] intArr = new int[26];
            for(char ch : str.toCharArray()){
                intArr[ch - 97]++;
            }

            StringBuilder builder = new StringBuilder();
            for(int i : intArr){
                builder.append(i);
                builder.append("*"); // just for seperation and correct hash, can be any char
            }

            String hashedString = builder.toString();

            if(!map.containsKey(hashedString)){
                map.put(hashedString, new ArrayList<>());
            }

            List<String> value = map.get(hashedString);
            value.add(str);
            map.put(hashedString, value);
        }

        List<List<String>> result = new ArrayList<>();

        for(List<String> list : map.values()){
            result.add(list);
        }
        return result;
    }
}