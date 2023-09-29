class Solution {
    public int removePalindromeSub(String s) {
        StringBuilder str = new StringBuilder(s);
        return s.equals(str.reverse().toString()) ? 1 : 2;
    }
}