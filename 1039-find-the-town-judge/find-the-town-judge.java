class Solution {
     public int findJudge(int n, int[][] trust) {
        if(n == 1){
            return 1;
        }
        
        int[] trustArray = new int[n+1]; // upto n
        
        for(int[] arr : trust){
            trustArray[arr[0]]--; // decrease if someone is trusting
            trustArray[arr[1]]++; // increase if someone is being trusted
        }

        for(int i = 0; i < trustArray.length; i++){
            if(trustArray[i] == n - 1){
                return i;
            }
        }

        return -1;
    }
}