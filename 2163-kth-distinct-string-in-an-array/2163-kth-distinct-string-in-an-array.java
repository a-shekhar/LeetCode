class Solution {
    public String kthDistinct(String[] arr, int k) {
        Map<String, Integer> map = new LinkedHashMap<>();
        int count = 0;

        for(String str : arr){
            map.put(str, map.getOrDefault(str, 0) + 1);
        }

        for(String key : map.keySet()){
            if(map.get(key)  == 1){
                count++;
                if(count == k){
                    return key;
                }
            }
        }
        return "";
    }
}