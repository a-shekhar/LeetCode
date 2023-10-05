class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int n = nums.length / 3;
        List<Integer> ans = new ArrayList<>();
        int i = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()){
            if (entry.getValue() > n) {
                ans.add(entry.getKey());
            }
            if (i == 1) {
                break;
            }
        }
        return ans;
    }
}