class Solution {
    public String restoreString(String s, int[] indices) {
        char[] result = new char[s.length()];
        int i = 0;
        for(int index : indices){
            result[index] = s.charAt(i);
            i++; 
        }

        return new String(result);
    }
}