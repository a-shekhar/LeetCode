class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        temp.add(1);
        ans.add(temp);
        if(numRows == 1){
            return ans;
        }
        List<Integer> list = new ArrayList<>();
        list.addAll(temp);
        while(numRows > 1){
            list.add(0, 0);
            list.add(0);
            temp = new ArrayList<>();
            for(int i = 1; i < list.size(); i++){
                int num = (list.get(i) + list.get(i-1));
                temp.add(num);
            }
            ans.add(temp);
            list = new ArrayList<>();
            list.addAll(temp);
            numRows--;
        }
        return ans;
    }
}