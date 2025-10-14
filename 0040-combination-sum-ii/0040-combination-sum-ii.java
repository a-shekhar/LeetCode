class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> tempList = new ArrayList<>();
        Arrays.sort(candidates);
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
            
            // if current is already greater than target no need to go further
            if(candidates[i] > target - sum){
                break;
            }
            
             // Skip duplicates on the same depth level
            if (i > index && candidates[i] == candidates[i - 1]) continue;

            tempList.add(candidates[i]);
            findSum(i + 1, sum + candidates[i], candidates, target, tempList, result);
            tempList.remove(tempList.size()-1);
        }

    }
}