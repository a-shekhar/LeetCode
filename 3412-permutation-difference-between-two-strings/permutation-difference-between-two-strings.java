class Solution {
    public int findPermutationDifference(String s, String t) {
        int perm = 0;
        for(int i = 0;  i < s.length(); i++){
            perm += Math.abs(i - t.indexOf(s.charAt(i)));
        }
        return perm;
    }
}