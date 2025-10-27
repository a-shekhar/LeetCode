class Solution {
    public List<Integer> lastVisitedIntegers(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        List<Integer> seen = new ArrayList<>();
        int k = 0;
        for(int num : nums){
            if(num > 0){
                seen.add(0, num);
                k = 0;
                continue;
            }
            k++;
            if(k > seen.size()){
                ans.add(-1);
            }else{
                ans.add(seen.get(k-1));
            }
        }
        return ans;
    }
}