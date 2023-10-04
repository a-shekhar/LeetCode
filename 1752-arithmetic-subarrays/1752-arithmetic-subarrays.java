class Solution {
    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
        List<Boolean> list = new ArrayList<>();
        int[] arr;
        int d;
        boolean flag;
        int i = 0;
        int index = 0;
        while (i < l.length) {
            arr = new int[(r[i] - l[i]) + 1];
            index = 0;
            for (int j = l[i]; j <= r[i]; j++) {
                arr[index] = nums[j];
                index++;
            }

            Arrays.sort(arr);
            flag = true;
            d = arr[1] - arr[0];
            for (int k = 2; k < arr.length; k++) {
                if (arr[k] - arr[k - 1] != d) {
                        flag = false;
                        break;
                }
            }

            list.add(flag);
            i++;
        }
        return list;
    }
}