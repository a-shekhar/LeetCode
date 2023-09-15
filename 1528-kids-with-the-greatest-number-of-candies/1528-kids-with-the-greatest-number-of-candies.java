class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int maxCandies = 0;
        for(int candy : candies){
            maxCandies = Math.max(candy, maxCandies);
        }

        List<Boolean> list = new ArrayList<>();
        
         for(int candy : candies){
            list.add(candy + extraCandies >= maxCandies ? true : false);     
        }
        return list;
    }
}