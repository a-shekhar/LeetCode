class Solution {
    public List<String> summaryRanges(int[] nums) {
         List<String> result = new ArrayList<>();
         if(nums.length == 0){
            return result;
         }
            int start = nums[0];
            int end = start;
            int expected = start+1;
            boolean isEnd = false;
            int i =1;
            while(i < nums.length){
                //System.out.println(nums[i] + " " + expected + " " + isEnd);
                if(isEnd){
                    start = nums[i];
                    end = nums[i];
                    expected = start + 1;
                    isEnd = false;
                    i++;
                }else if(nums[i] == expected){
                    end = nums[i];
                    expected++;
                    i++;
                } else {
                    if(start == end){
                        result.add(String.valueOf(start));
                    }else{
                        result.add(start+"->"+end);
                    }
                    isEnd = true;
                }
            }
            // add last one
            if(start == end){
                result.add(String.valueOf(start));
            }else{
                result.add(start+"->"+end);
            }
            //System.out.println(result);
            return result;
    }
}