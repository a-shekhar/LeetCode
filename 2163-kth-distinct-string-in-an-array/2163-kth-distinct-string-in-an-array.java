class Solution {
    public String kthDistinct(String[] arr, int k) {
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
        for(String str: arr){
            map.putIfAbsent(str, 0);
            map.put(str, map.get(str) + 1);
        }
        String ans = "";
        for(Map.Entry<String, Integer> entry : map.entrySet()){
            if(entry.getValue() == 1){
                k--;
            }
            if(k == 0){
                ans = entry.getKey();
                break;
            }
        }
        return ans;
    }
}