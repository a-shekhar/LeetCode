class Solution {
    public int[] decode(int[] encoded, int first) {
        int[] ans = new int[encoded.length+1];
        ans[0] = first;
        int j = 1;
        for(int i = 0; i < encoded.length; i++){
            ans[j] = encoded[i] ^ ans[i];
            j++;
        }
        return ans;
    }
}