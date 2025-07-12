class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for(String str: strs){
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String sortedString = new String(chars);
            if(!map.containsKey(sortedString)){
                map.put(sortedString, new ArrayList<>());
            }

            List<String> value = map.get(sortedString);
            value.add(str);
            map.put(sortedString, value);
        }
        List<List<String>> result = new ArrayList<>();

        for(List<String> list : map.values()){
            result.add(list);
        }
        return result;
    }
}