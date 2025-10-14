class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> tempList = new ArrayList<>();
        findSum(0, 0, candidates, target, tempList, result);
        return result;
    }

    private void findSum(int index, int sum, int[] candidates, int target, List<Integer> tempList, List<List<Integer>> result) {
        
        if(sum > target){
            return;
        }
        
        if(sum == target){
            result.add(new ArrayList<>(tempList));
            return;
        }

        for(int i = index; i < candidates.length; i++){
            tempList.add(candidates[i]);
            findSum(i , sum + candidates[i], candidates, target, tempList, result);
            tempList.remove(tempList.size()-1);
        }

    }
}