class Solution {
    public int sumCounts(List<Integer> nums) {
        int n = nums.size();
        int sum = 0;

        for (int start = 0; start < n; start++) {
            for (int end = start; end < n; end++) {
                Set<Integer> set = new HashSet<>();
                for (int k = start; k <= end; k++) {
                    set.add(nums.get(k));
                }
                sum += set.size() * set.size();
            }
        }

        return sum;
    }
}