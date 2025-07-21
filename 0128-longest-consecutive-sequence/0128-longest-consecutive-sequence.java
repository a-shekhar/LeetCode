class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int num : nums){
            set.add(num);
        }

        int longestConsecutiveSeq = 0;
        int consecutiveSeq = 0;
        int currNum;

        for(int num : set){

            consecutiveSeq = 0;
            
            if(!set.contains(num-1)){ // pick the lowest int
                currNum = num;
                consecutiveSeq = 1;
                while(set.contains(currNum + 1)){
                    consecutiveSeq++;
                    currNum = currNum + 1;
                }

                longestConsecutiveSeq = Math.max(longestConsecutiveSeq, consecutiveSeq);
            }
        }

        return longestConsecutiveSeq;
    }
}