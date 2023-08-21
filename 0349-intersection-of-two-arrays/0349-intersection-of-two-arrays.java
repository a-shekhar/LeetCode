class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
       
        Set<Integer> st = new HashSet<>();
        Set<Integer> inter = new HashSet<>();
        
        for(int num: nums1){
            st.add(num);
        }

        for(int num: nums2){
            if(st.contains(num)){
                inter.add(num);
                st.remove(num);
            }
        }

       int[] result = new int[inter.size()];
       int i = 0;
       for(int num: inter){
           result[i] = num;
           i++;
       }
       return result;
    }
}