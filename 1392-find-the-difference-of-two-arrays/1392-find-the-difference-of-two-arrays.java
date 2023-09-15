class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> list1 = new HashSet<>();
        Set<Integer> list2 = new HashSet<>();
        List<Integer> temp = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();

        for(int num : nums1){
            list1.add(num);
        }

        for(int num : nums2){
            list2.add(num);
        }

        for(int num: list1){
            if(!list2.contains(num)){
                temp.add(num);
            }else{
                list2.remove(num);
            }
        }

        ans.add(temp);
        temp = new ArrayList<>();

        for(int num: list2){
            temp.add(num);
        }

        ans.add(temp);

    return ans;

    }
}