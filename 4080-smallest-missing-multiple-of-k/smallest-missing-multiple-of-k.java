class Solution {
    public int missingMultiple(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();
        for(int num : nums){
            set.add(num);
        }

         int i = 1;
        for(i = 1;  i * k <= 10000; i++){
            if(!set.contains(i * k)){
                return i*k;
            }
        }
        return i*k;
    }
}