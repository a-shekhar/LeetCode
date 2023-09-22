class Solution {
    public boolean isPathCrossing(String path) {
        List<String> list = new ArrayList<>();
        int x = 0, y = 0;
        list.add(x+","+y);
        for(int i=0; i< path.length(); i++){
            if(path.charAt(i) == 'N'){
                y++;
            } else if (path.charAt(i) == 'S') {
                y--;
            } else if (path.charAt(i) == 'E'){
                x++;
            }else{
                x--;
            }
            System.out.println((x+ "," +y) + " " + (x+","+y));
            if(list.contains(x+ "," +y)){
                return true;
            }else{
                list.add(x+","+y);
            }
        }
        return false;
    }
}