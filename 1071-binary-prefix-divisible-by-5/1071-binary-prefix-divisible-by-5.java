import java.math.BigInteger;

class Solution {
      public List<Boolean> prefixesDivBy5(int[] nums) {
        BigInteger val = BigInteger.ZERO;
        BigInteger two = new BigInteger("2");
        List<Boolean> list = new ArrayList<>();
        for(int num : nums){
            val = (val.multiply(two)).add(new BigInteger(String.valueOf(num)));
            list.add(val.mod(BigInteger.valueOf(5)).equals(BigInteger.ZERO));
        }
        return list;
    }
}