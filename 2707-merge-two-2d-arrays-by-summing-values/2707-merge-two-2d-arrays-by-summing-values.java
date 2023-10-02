class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        Map<Integer, Integer> map = new TreeMap<>();
        for(int[] num : nums1){
            map.put(num[0], num[1]);
        }

        for(int[] num : nums2){
            if(map.containsKey(num[0])){
                map.put(num[0], map.get(num[0]) + num[1]);
            }else {
                map.put(num[0], num[1]);
            }
        }
        int[][] ans = new int[map.size()][];
        int i = 0;
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            ans[i] = new int[]{entry.getKey(),entry.getValue()};
            i++;
        }
        return ans;
    }
}