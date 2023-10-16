class Solution {
     public List<Integer> intersection(int[][] nums) {
        int[] arr = new int[1001];
        for (int[] ints : nums) {
            for (int num : ints) {
                arr[num]++;
            }
        }

        List<Integer> list =new ArrayList<>();
        int n = nums.length;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == n){
                list.add(i);
            }
        }
        return list;
    }

}