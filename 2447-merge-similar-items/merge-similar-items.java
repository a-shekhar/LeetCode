class Solution {
    public List<List<Integer>> mergeSimilarItems(int[][] items1, int[][] items2) {
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for(int[] item : items1){
            map.put(item[0], item[1]);
        }
        int temp = 0;
        for(int[] item : items2){
            if(map.containsKey(item[0])){
                temp = map.get(item[0]);
                map.put(item[0], temp + item[1]);
            }else {
                map.put(item[0], item[1]);
            }
        }
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            list = new ArrayList<>();
            list.add(entry.getKey());
            list.add(entry.getValue());
            ans.add(list);
        }
        return  ans;
    }
}