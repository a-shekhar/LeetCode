class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
         // Hashmap to store next greater element for each number 
        HashMap<Integer, Integer> ngeHashMap = new HashMap<>();
        Stack<Integer> stack = new Stack<>();
        int[] result = new int[nums1.length];

        for(int i = nums2.length-1; i >= 0; i--){
            if(stack.isEmpty()){
                ngeHashMap.put(nums2[i], -1);
                stack.push(nums2[i]);
                continue;
            }

            if(stack.peek() > nums2[i]){
                ngeHashMap.put(nums2[i], stack.peek());
                stack.push(nums2[i]);
            } else{
                while(! stack.isEmpty() && stack.peek() <= nums2[i]){
                    stack.pop();
                }

                if(stack.isEmpty()){
                    ngeHashMap.put(nums2[i], -1);
                }else{
                    ngeHashMap.put(nums2[i], stack.peek());
                }
                stack.push(nums2[i]);
            }
            
        }

        //System.out.println(ngeHashMap);
        for(int i = 0; i < nums1.length; i++){
            result[i] = ngeHashMap.get(nums1[i]);
        }

        return result;
    }
}