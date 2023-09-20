class Solution {
    public int thirdMax(int[] nums) {
        List<Integer> list = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        for(int num : nums){
            set.add(num);
        }
        list.addAll(set);
        Collections.sort(list);
        if(list.size() < 3){
            return list.get(list.size()-1);
        }
        return list.get(list.size()-3);
    }
}