class Solution {
    public int findContentChildren(int[] g, int[] s) {
         // Sort
        Arrays.sort(g);
        Arrays.sort(s);
        // Initialize points
        int i = 0;
        int j = 0;
        int count = 0;
        // Iterate through both arrays
        while(i < g.length && j < s.length) {
            if(s[j] >= g[i]) {
                // If they can be catered, increment count
                count++;
                i++;
                j++;
            }else{
                j++;
            }
        }
        return count;
    }
}