class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int[] freq = new int[A.length+1];
        int[] res = new int[A.length];
        int j = 0;
        
        for(int i = 0;  i  < A.length; i++){
            freq[A[i]]++;
            freq[B[i]]++;
            int count = 0;
            for(int num : freq){
                if(num == 2) count++;
            }
            res[j++] = count;
        }
        return res;
    }
}