class Solution {
    public int findMaxK(int[] nums) {
       int maxNum = -1;
       Set<Integer> set = new HashSet<>();
       Arrays.sort(nums);
       for(int num: nums){
           if(set.contains(-1 * num)){
               maxNum  = Math.max(maxNum, num);
           }else if(num < 0){
               set.add(num);
           }
       } 
       return maxNum;
    }
}