class Solution {
    public int[] decrypt(int[] code, int k) {
        int[] arr = new int[code.length];
        if(k == 0){
            return arr;
        }
        int len = arr.length;
        int n;
        int sum;
        if(k > 0){
            for(int i=0; i < arr.length; i++){
                n = 1;
                sum = 0;
                while(n <= k){
                    sum += code[(i+n) % len];
                    n++;
                }
                arr[i] =sum;
            }
        }else{
            for(int i=0; i < arr.length; i++){
                n = -1;
                sum = 0;
                while(n >= k){
                    sum +=((i+n) % len)  < 0 ? code[(len + ((i+n) % len))] :  code[(i+n) % len];
                    n--;
                }
                arr[i] =sum;
            }
        }
        return arr;
    }
}