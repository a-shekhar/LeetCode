class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        
        int[] freq = new int[A.length+1];
        int[] res = new int[A.length];
        int count = 0;
        
        for(int i = 0;  i  < A.length; i++){
            if(++freq[A[i]] == 2) count++;
            if(++freq[B[i]] == 2) count++;
            res[i] = count;
        }
        return res;
    }
}