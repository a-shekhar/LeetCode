class Solution {
    public int[] plusOne(int[] digits) {
        List<Integer>list = new ArrayList<>();
        int j = digits.length-1;
        int carry = 1;
        int num = 0;
        while(j >= 0){
            num = digits[j] + carry;
            carry = num / 10;
            list.add(0, num % 10);
            j--;
        }
        if(carry == 1){
            list.add(0, carry);
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }

}