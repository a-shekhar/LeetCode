class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int[] numbers = new int[nums.length+1];
        for(int num : nums){
           numbers[num]++;
        }

        for(int i = 1; i <= nums.length; i++){
            if(numbers[i] == 0){
                list.add(i);
            }
        }
        return list;
    }
}