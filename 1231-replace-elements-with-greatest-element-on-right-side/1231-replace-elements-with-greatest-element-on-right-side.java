class Solution {
    public int[] replaceElements(int[] arr) {
        int maxElement = -1;
        int curr;
        for(int i = arr.length - 1; i >=0; i--){
            curr = arr[i];
            arr[i] = maxElement;
            maxElement = Math.max(maxElement, curr);
        }
        return arr;
    }
}