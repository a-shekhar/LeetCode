class Solution {
    public boolean isOneBitCharacter(int[] bits) {
        int i = 0;
        while(i < bits.length){
            if(i + 1 == bits.length) return true;
            if(bits[i] == 1) i += 2;
            else i++;
        }

        return false;
    }
}