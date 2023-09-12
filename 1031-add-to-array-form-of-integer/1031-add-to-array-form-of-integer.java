class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> list = new ArrayList<>();
        int sum = 0;
        int carry = 0;
        for(int j = num.length-1; j >= 0; j--){
            sum = carry + num[j] + k;
            list.add(0, sum%10);
            carry = sum / 10;
            k = 0;
        }
        while(carry > 0){
            list.add(0, carry%10);
            carry = carry/10;
        }
        return list;
    }
}