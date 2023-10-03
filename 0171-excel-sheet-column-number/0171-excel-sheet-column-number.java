class Solution {
    public int titleToNumber(String columnTitle) {
        int i = 0;
        int columnNo = 0;
        for(int j = columnTitle.length()-1; j >= 0; j--){
            columnNo += (int) (Math.pow(26, i) * ((int) columnTitle.charAt(j) - 64));
            i++;
        }
        return columnNo;
    }
}