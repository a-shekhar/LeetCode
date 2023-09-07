class Solution {
    public int[] distributeCandies(int candies, int num_people) {
        int n = 1;
        int[] ans = new int[num_people];
        int candy = 0;
        while(candies > 0){
            for(int i = 0; i < num_people; i++){
                if(candies >= n){
                    ans[i] += n;
                    candies -= n;
                    n++;
                }else{
                    ans[i] += candies;
                    return ans;
                }
            
            }
        }
        return ans;
    }
}