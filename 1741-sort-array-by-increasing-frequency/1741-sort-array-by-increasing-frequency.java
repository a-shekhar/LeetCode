class Solution {
    public int[] frequencySort(int[] nums) {
        TreeMap<Integer, Integer>map = new TreeMap<>(Collections.reverseOrder());
        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        List<Integer> values = new ArrayList<>(map.values());
        Collections.sort(values);
        int[] ans = new int[nums.length];
        int i = 0;
        List<Integer> keysVisited  = new ArrayList<>();
        for(int value : values){
            for(Map.Entry<Integer, Integer> entry : map.entrySet()){
                if(!keysVisited.contains(entry.getKey()) && value == entry.getValue()){
                    int j = 0;
                    while(j < entry.getValue()){
                        ans[i] = entry.getKey();
                        i++;
                        j++;
                    }
                    keysVisited.add(entry.getKey());
                }
            }
        }
        return ans;
    }
}