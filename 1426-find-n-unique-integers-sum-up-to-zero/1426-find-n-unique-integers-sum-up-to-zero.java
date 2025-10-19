class Solution {
    public int[] sumZero(int n) {
        int[] result = new int[n];
        int index = 0;
        int boundry = n / 2;
        for(int i = - boundry; i <= boundry; i++){
            if(i == 0 && n % 2 == 0){
                continue;
            }
            result[index++] = i;
        }
        return result;
    }
}