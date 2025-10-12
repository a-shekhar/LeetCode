class Solution {
   public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> tempList = new ArrayList<>();
        findComb(1, n, k, tempList, result);
        return result;
    }

    void findComb(int start, int n, int k, List<Integer> tempList,  List<List<Integer>> result){

         if(tempList.size() == k){
            result.add(new ArrayList<>(tempList));
            return;
        }

        if(start > n){ // no need to check others 
            return;
        }

        tempList.add(start);

        findComb(start+1, n, k, tempList, result);

        // remove and backtrak
        tempList.remove(tempList.size() - 1);

        // explore other oppurtunities
        findComb(start+1, n, k, tempList, result);
    }
}