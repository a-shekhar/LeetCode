class Solution {
    public int[] replaceElements(int[] arr) {
        int max = -1;
        int[] ans = new int[arr.length];
        for(int j = arr.length-1; j >= 0; j--){
            ans[j] = max;
            max = Math.max(max, arr[j]);
        }
        return ans;
    }
}