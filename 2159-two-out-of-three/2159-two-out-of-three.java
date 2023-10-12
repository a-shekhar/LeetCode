class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        List<Integer> list = new ArrayList<>();
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        Set<Integer> set3 = new HashSet<>();
        Set<Integer> set = new HashSet<>();

        for(int num : nums1){
            set1.add(num);
        }

        for(int num : nums2){
            set2.add(num);
        }

        for(int num : nums3){
            set3.add(num);
        }

        for(int num : set1){
            if(set2.contains(num) || set3.contains(num)){
                set.add(num);
            }
        }

        for(int num : set2){
            if(set3.contains(num)){
                set.add(num);
            }
        }

        list.addAll(set);
        return list;
    }
}