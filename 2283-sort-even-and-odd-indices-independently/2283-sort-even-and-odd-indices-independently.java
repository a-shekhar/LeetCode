class Solution {
    public int[] sortEvenOdd(int[] nums) {
        List<Integer> evens = new ArrayList<>();
        List<Integer> odds = new ArrayList<>();
        for(int i = 0; i < nums.length; i+=2){
            evens.add(nums[i]);
        }
        for(int i = 1; i < nums.length; i+=2){
            odds.add(nums[i]);
        }
        Collections.sort(evens);
        Collections.sort(odds, Collections.reverseOrder());
        
        int j = 0;
        for(int i=0; i < evens.size(); i++){
            nums[j] = evens.get(i);
            j+=2;
        }
        
        j = 1;
        for(int i = 0; i < odds.size(); i++){
            nums[j] = odds.get(i);
            j+=2;
        }
        return nums;
    }
}