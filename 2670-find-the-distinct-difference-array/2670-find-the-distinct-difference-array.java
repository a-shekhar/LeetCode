class Solution {
    public int[] distinctDifferenceArray(int[] nums) {
        int n = nums.length;
        int[] prefix = new int[n];
        int[] suffix = new int[n];

        Set<Integer> seen = new HashSet<>();

        for(int i = 0; i < n; i++){
           seen.add(nums[i]);
           prefix[i] = seen.size();
        }

        seen.clear();
        for(int i = n-1; i >= 0; i--){
           seen.add(nums[i]);
           suffix[i] = seen.size();
        }
        
        for(int i = 0; i < n - 1; i++){
           prefix[i] = prefix[i] - suffix[i+1];
        }

        return prefix;
    }
}