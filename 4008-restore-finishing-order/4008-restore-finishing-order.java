class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        Set<Integer> set = new HashSet<>();
        int[] result = new int[friends.length];
        int i = 0;
        for(int friend : friends){
            set.add(friend);
        }

        for(int od : order){
            if(set.contains(od)){
                result[i++] = od;
            }
        }
        return result; 
    }
}