class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();

        // add frequency 
        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // create a bucket
        List<Integer>[] bucket = new ArrayList[nums.length + 1];
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(bucket[entry.getValue()] == null){
                bucket[entry.getValue()] = new ArrayList<>();
            }

            bucket[entry.getValue()].add(entry.getKey());
        } 

        // get last k element

        int[] result = new int[k];
        int pos = 0;

        for(int i = bucket.length-1; i >= 0; i--){
            if(bucket[i] != null){
                for(Integer num : bucket[i]){
                    result[pos] = num;
                    pos++;
                }

                if(pos >= k){
                    break;
                }
            }
        }

        return result;
    }
}