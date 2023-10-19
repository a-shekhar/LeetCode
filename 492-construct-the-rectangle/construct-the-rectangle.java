class Solution {
        public int[] constructRectangle(int area) {
        int L = (int) Math.sqrt(area);
        int[] arr = new int[]{area, 1};
        int min = Integer.MAX_VALUE;
        for(int i=2; i <= L; i++ ){
            if (area % i == 0 && Math.abs((area/i)-i) < min){
                     arr = new int[]{area/i, i};
                }
        }
        return arr;
    }

}