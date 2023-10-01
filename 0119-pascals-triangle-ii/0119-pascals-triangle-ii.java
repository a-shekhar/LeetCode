class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> row = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        temp.add(1);
        row.add(temp);
        int n = rowIndex;
        while(rowIndex > 0){
            temp = row.get(row.size()-1);
            temp.add(0,0);
            temp.add(0);
            List<Integer>list = new ArrayList<>();
            for(int i= 1; i<temp.size(); i++){
                list.add(temp.get(i) + temp.get(i-1));
            }
            row.add(list);
            rowIndex--;
        }

        return row.get(row.size()-1);
    }
}