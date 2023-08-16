class Solution {
    public int repeatedNTimes(int[] nums) {
        Set<Integer> st = new HashSet<>();
        for(int num: nums){
            if(st.contains(num)){
                return num;
            }else{
                st.add(num);
            }
        }
        return -1;
    }
}