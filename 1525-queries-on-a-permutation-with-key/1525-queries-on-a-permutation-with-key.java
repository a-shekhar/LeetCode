class Solution {
    public int[] processQueries(int[] queries, int m) {
        int[] ans = new int[queries.length];
        ArrayList<Integer> list = (ArrayList<Integer>) IntStream.rangeClosed(1, m)
                .boxed().collect(Collectors.toList());

        int index;
        int i = 0;
        for (int query : queries){
            index = list.indexOf(query);
            ans[i] = index;
            list.remove(index);
            list.add(0, query);
            i++;
        }
        return ans;
    }

}