
class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> 
                    {
                        int cmp = Integer.compare(a[0], b[0]); // compare by value
                        if(cmp != 0){
                            return cmp;
                        }
                        return Integer.compare(a[1], b[1]); // if same value index should take priorty 
                    });
                    
        for(int i = 0; i < nums.length; i++){
            //System.out.println(i);
            pq.offer(new int[]{nums[i], i});
        }

        while(k > 0){
            int[] currMin = pq.poll();
            //System.out.println(currMin[1]);
            currMin[0] = multiplier * currMin[0];
            pq.offer(currMin);
            k--;
        }

        //System.out.println(pq.toString());

        while(!pq.isEmpty()){
            int[] curr = pq.poll();
           System.out.println(curr[1]);

            nums[curr[1]] = curr[0];
        }

        return nums;
    }
}