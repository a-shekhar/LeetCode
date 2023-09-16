class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
       int num = 0;
        boolean flag = false;
        int rem = 0;
        List<Integer> list = new ArrayList<>();

        for(int i = left; i <= right; i++){
            flag = true;
            num = i;
            while(num > 0){
                rem = num % 10;
                if(rem == 0){
                    flag = false;
                    break;
                }
                if(i % rem != 0){
                    flag = false;
                    break;
                }
                num /= 10;
            }
            if(flag){
                list.add(i);
            }
        }
        return list;
    }
}