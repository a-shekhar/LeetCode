class Solution {
    public int longestConsecutive(int[] nums) {
        Map<Integer, Boolean> visited = new HashMap<>();
        for(int num : nums){
            visited.put(num, false);
        }

        int longestConsecutiveSeq = 0;
        int consecutiveSeq = 0;
        int next, prev ;

        for(int num : nums){
            consecutiveSeq = 0;
            if(visited.get(num) == true){
                continue;
            }

            consecutiveSeq++;
            // check next items avialable 
            next = num + 1;
            while (visited.containsKey(next) && !visited.get(next)){
                visited.put(next, true);
                next++;
                consecutiveSeq++;
            }

            // check prev items avialable 
            prev = num - 1;
            while (visited.containsKey(prev) && !visited.get(prev)){
                visited.put(prev, true);
                prev--;
                consecutiveSeq++;
            }

            longestConsecutiveSeq = Math.max(longestConsecutiveSeq, consecutiveSeq);
        }

        return longestConsecutiveSeq;
    }
}