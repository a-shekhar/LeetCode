class Solution {
    public int lastStoneWeight(int[] stones) {
        List<Integer> list = new ArrayList<>();
        for(Integer stone: stones){
            list.add(stone);
        }

        int x, y = 0;

        while(list.size() > 1){
            Collections.sort(list);
            y = list.get(list.size()-1);
            x = list.get(list.size()-2);
            list.remove(Integer.valueOf(Integer.valueOf(x)));
            list.remove(Integer.valueOf(Integer.valueOf(y)));
            if(x != y){
                list.add(y-x);
            }
        }
        return list.size() == 0 ? 0 : list.get(0);
    }
}