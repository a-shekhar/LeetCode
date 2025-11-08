class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int minElement = Integer.MAX_VALUE;
        int maxElement = Integer.MIN_VALUE;
        for(int num : nums){
            minElement = Math.min(num, minElement);
            maxElement = Math.max(num, maxElement);
        }

        int[] arr = new int[maxElement-minElement+1];

        for(int num : nums){
            arr[num-minElement]++;
        }

    final int min = minElement;  // make a final copy


        return IntStream.range(0, arr.length).filter(i -> arr[i] == 0).map(i -> i + min).boxed().collect(Collectors.toList());


    }
}