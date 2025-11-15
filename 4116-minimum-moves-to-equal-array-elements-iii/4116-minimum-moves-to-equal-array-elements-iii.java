class Solution {
    public int minMoves(int[] nums) {
        int maxElement = Integer.MIN_VALUE;
        int moves = 0;
        for(int num : nums){
            maxElement = Math.max(maxElement, num);
        }

        for(int num : nums){
            moves += maxElement - num;
        }

        return moves;
    }
}