class Solution {
    public int[] twoSum(int[] arr, int num) {
        int n1 =0;
		int n2 = arr.length -1;
		while(arr[n1] + arr[n2] != num) {
			if(arr[n1] + arr[n2] < num) {
				n1++;
			}else
				n2--;
		}
		return new int[] {n1+1, n2+1};
    }
}