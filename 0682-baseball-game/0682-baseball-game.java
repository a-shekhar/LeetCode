class Solution {
    public int calPoints(String[] operations) {
        List<Integer> list = new ArrayList<>();
        int len = 0;
        int sum = 0;
        int temp = 0;
        for(String op : operations){
            if(op.equals("+")){
                temp = list.get(len-1) + list.get(len-2);
                list.add(temp);
                sum += temp;
                len++;
            }else if(op.equals("D")){
                temp = 2 * list.get(len-1);
                list.add(temp);
                sum += temp;
                len++;
            }else if(op.equals("C")){
                temp = list.get(len-1);
                list.remove(len-1);
                sum -= temp;
                len--;
            }else{
               list.add(Integer.valueOf(op));
               sum += Integer.valueOf(op);
               len++; 
            }
        }
        return sum;
    }
}