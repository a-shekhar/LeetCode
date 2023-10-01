class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> temp = new ArrayList<>();
        temp.add(1);
    
        while(rowIndex > 0){
            temp.add(0,0);
            temp.add(0);
            List<Integer>list = new ArrayList<>();
            for(int i= 1; i<temp.size(); i++){
                list.add(temp.get(i) + temp.get(i-1));
            }
            temp = new ArrayList<>(list);
            rowIndex--;
        }

        return temp;
    }
}