class Solution {
        public int[] constructRectangle(int area) {
        int L = (int) Math.sqrt(area);
        int[] arr = new int[]{area, 1};
        for(int j=L; j >= 1; j--){
            if (area % j == 0){
                return new int[]{area/j, j};
            }
        }
        return arr;
    }

}