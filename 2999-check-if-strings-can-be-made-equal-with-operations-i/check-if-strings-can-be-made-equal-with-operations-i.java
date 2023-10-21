class Solution {
    public boolean canBeEqual(String s1, String s2) {
        if (s1.equals(s2)){
            return true;
        }
        Set<String> visited = new HashSet<>();
        String swapped;
        while (true){
            swapped = s2;
            for(int j= 2; j < s2.length(); j++){
                swapped = swap(swapped, j);
                if(swapped.equals(s1)){
                    return true;
                }
            }
            s2 = swapped;
            if(visited.contains(s2)){
                break;
            }
            visited.add(s2);
        }
        return false;
    }

    private String swap(String s2, int j){
        int i = j-2;
        StringBuilder s = new StringBuilder(s2);
        s.setCharAt(i, s2.charAt(j));
        s.setCharAt(j, s2.charAt(i));
        return s.toString();
    }
}