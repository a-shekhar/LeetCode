class Solution {
    public int[] sumEvenAfterQueries(int[] nums, int[][] queries) {
        int sum = 0;
        int index = 0;
        int[] answer = new int[nums.length];
        for(int num : nums){
            if(num % 2== 0){
                sum += num;
            }
        }

        for(int[] query : queries){
            if(nums[query[1]] % 2 == 0){
                sum -= nums[query[1]];
            }

            nums[query[1]]  += query[0];
            if(nums[query[1]] % 2 ==0){
                sum += nums[query[1]];
            }

            answer[index] = sum;
            index++;
        }
        return answer;
    }
}