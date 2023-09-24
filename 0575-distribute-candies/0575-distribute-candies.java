class Solution {
    public int distributeCandies(int[] candyType) {
        Set<Integer> set = new HashSet<>();
        int count = candyType.length/2;
        for(int candy : candyType){
            set.add(candy);
        }
        return Math.min(set.size(), count);
    }
}