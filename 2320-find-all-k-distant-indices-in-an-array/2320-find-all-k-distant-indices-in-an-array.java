class Solution {
    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        List<Integer> list = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        for(int i =0 ; i < nums.length; i++){
            for(int j = 0 ; j < nums.length; j++){
                if(nums[j] == key && Math.abs(i-j) <= k){
                        set.add(i);
                }
            }
        }
        
        list.addAll(set);
        Collections.sort(list);
        return list;
    }
}