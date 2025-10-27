class Solution {
    public int numberOfBeams(String[] bank) {
        int prev = 0;
        int lasers = 0;
        for(String b : bank){
            int ones = 0;
            for(int i = 0; i < b.length(); i++){
                if(b.charAt(i) == '1'){
                    ones++;
                }
            }

            if(ones > 0){
                lasers += ones * prev;
                prev = ones;
            }
        }

        return lasers;
    }
}