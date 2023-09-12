class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        Map<String, Integer> map1 = new HashMap<>();
        Map<String, Integer> map2 = new HashMap<>();
        List<String> list = new ArrayList<>();
        int minval = Integer.MAX_VALUE;
        int temp = 0;
        
         for(int i = 0; i < list1.length; i++){
            map1.put(list1[i], i);
        }

        for(int i = 0; i < list2.length; i++){
            if(map1.containsKey(list2[i])){
                temp = i + map1.get(list2[i]);
                map2.put(list2[i], temp);
                minval = Math.min(minval, temp);
            }
        }

        
        for(Map.Entry<String, Integer> entry: map2.entrySet()){
            if(entry.getValue() == minval){
                list.add(entry.getKey());
            }
        }
        return list.toArray(new String[list.size()]);
    }
}