class Solution {
    public int[] replaceElements(int[] arr) {
        int maxElement = -1;
        int temp;
        for(int i = arr.length - 1; i >= 0; i--){
            temp = maxElement;
            maxElement = Math.max(maxElement, arr[i]);
            arr[i] = temp;
        }
        return arr;
    }
}