class Solution {
    public int countPairs(List<Integer> nums, int target) {
        int count = 0;
        Integer[] numsArr = nums.stream().toArray(Integer[]::new);
        Arrays.sort(numsArr);
        for(int i=0; i < numsArr.length-1; i++){
            for(int j=i+1; j < numsArr.length; j++){
                if(numsArr[i] + numsArr[j] < target){
                    count++;
                }else{
                    break;
                }
            }
        }
        return count;
    }
}