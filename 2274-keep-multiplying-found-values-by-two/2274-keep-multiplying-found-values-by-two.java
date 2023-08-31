class Solution {
    public int findFinalValue(int[] nums, int original) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int num : nums){
            list.add(num);
        }

        while(true){
            if(list.contains(original)){
                original *= 2;
            }else{
                break;
            }
        }
        return original;
    }
}