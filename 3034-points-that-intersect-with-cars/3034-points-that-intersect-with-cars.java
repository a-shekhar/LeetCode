class Solution {
    public int numberOfPoints(List<List<Integer>> nums) {
        Set<Integer> set = new HashSet<>();
        int index = 0;
        int start = 0;
        int end = 0;
        for(int i = 0; i < nums.size(); i++){
            start = nums.get(i).get(0);
            end = nums.get(i).get(1);
            while(start <= end){
                set.add(start);
                start++;
            }
        }
        return set.size();
    }
}