class Solution {
    public int[] decimalRepresentation(int n) {
        List<Integer> list = new ArrayList<>();
        int pow = 0;
        while(n > 0){
            int num = (int) ((n % 10) * Math.pow(10, pow));
            if(num > 0) list.add(num);
            n /= 10;
            pow++;
        }
        Collections.reverse(list);
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}