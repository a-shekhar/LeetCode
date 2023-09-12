class Solution {
    public int[] minOperations(String boxes) {
        int index = 0;
        int sum = 0;
        int ans[] = new int[boxes.length()];
        for(int i = 0; i < boxes.length(); i++){
            sum = 0;
            for(int j = 0; j < boxes.length(); j++){
                if(j != i && boxes.charAt(j) == '1'){
                    sum += Math.abs(j-i);
                }
            }
            ans[i] = sum;
        }


        return ans;
    }
}